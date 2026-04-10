import { useEffect, useState } from "react";
import API from "./api";
import TaskList from "./components/TaskList";
import AddTask from "./components/AddTask";

function App() {
  const [tasks, setTasks] = useState([]);
  const [loading, setLoading] = useState(false);

  const fetchTasks = async () => {
    setLoading(true);
    try {
      const res = await API.get("/tasks");
      setTasks(res.data);
    } catch (err) {
      console.log(err);
    }
    setLoading(false);
  };

  useEffect(() => {
    fetchTasks();
  }, []);

  const addTask = async (title) => {
    await API.post("/tasks", { title });
    fetchTasks();
  };

  const toggleTask = async (id) => {
    await API.patch(`/tasks/${id}`);
    fetchTasks();
  };

  const deleteTask = async (id) => {
    await API.delete(`/tasks/${id}`);
    fetchTasks();
  };

  return (
    <div className="container">
      <h1>Task Manager</h1>
      <AddTask onAdd={addTask} />
      {loading ? <p>Loading...</p> : (
        <TaskList tasks={tasks} onToggle={toggleTask} onDelete={deleteTask} />
      )}
    </div>
  );
}

export default App;
