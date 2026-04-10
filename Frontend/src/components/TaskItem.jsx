function TaskItem({ task, onToggle, onDelete }) {
  return (
    <div className="task">
      <span
        onClick={() => onToggle(task.id)}
        className={task.completed ? "completed" : ""}
        style={{ cursor: "pointer" }}
      >
        {task.title}
      </span>
      <button onClick={() => onDelete(task.id)}>Delete</button>
    </div>
  );
}

export default TaskItem;
