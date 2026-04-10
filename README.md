# 📝 Task Manager Application

A simple full-stack Task Manager application built as part of a technical assignment.
The app allows users to create, view, update, and delete tasks with a clean and responsive interface.

---

## 🚀 Tech Stack

**Frontend**

* React (Vite)
* Axios

**Backend**

* Spring Boot
* Spring Data JPA

**Database**

* PostgreSQL

---

## ✨ Features

* ✅ Create new tasks
* 📋 View all tasks
* 🔄 Mark tasks as completed
* ❌ Delete tasks
* ⏳ Loading states for better UX
* ⚠️ Basic error handling

---

## 📡 API Endpoints

| Method | Endpoint    | Description            |
| ------ | ----------- | ---------------------- |
| GET    | /tasks      | Get all tasks          |
| POST   | /tasks      | Create a new task      |
| PATCH  | /tasks/{id} | Toggle task completion |
| DELETE | /tasks/{id} | Delete a task          |

---

## 🗂️ Project Structure

```
task-manager/
 ├── backend/    # Spring Boot application
 ├── frontend/   # React application
 └── README.md
```

---

## ⚙️ Setup Instructions

### 🔧 Backend Setup

1. Navigate to backend folder:

```
cd backend
```

2. Configure PostgreSQL in `application.properties`:

```
spring.datasource.url=jdbc:postgresql://localhost:5432/taskdb
spring.datasource.username=your_username
spring.datasource.password=your_password
```

3. Run the application:

```
mvn spring-boot:run
```

---

### 💻 Frontend Setup

1. Navigate to frontend folder:

```
cd frontend
```

2. Install dependencies:

```
npm install
```

3. Run the development server:

```
npm run dev
```

---

## 🧪 How to Use

* Open the frontend in your browser
* Add a new task using the input field
* Click on a task to mark it as completed
* Click delete to remove a task

---

## 🧠 Design Decisions

* Used **Spring Boot + JPA** for clean backend architecture
* PostgreSQL for persistent storage
* React with component-based structure for maintainability
* Focused on **functionality, clarity, and clean code** over complex UI

---

## ⚖️ Assumptions & Trade-offs

* Minimal UI styling to prioritize functionality
* No authentication required as per assignment scope
* Basic validation implemented on backend

---

## 🌟 Possible Improvements

* Edit task title
* Filter tasks (completed / pending)
* Add authentication
* Improve UI with modern design system

---

## 📌 Notes

This project was intentionally kept simple and focused to align with the assignment requirement of a 1–2 hour implementation.

---
