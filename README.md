# Task Manager App

## Overview
This is a Task Manager application built using Spring Boot. It leverages JPA for database management and implements JWT authentication for secure access. The application supports both H2 and MySQL databases.

## Features
- **User Authentication**: Secure user authentication using JWT (JSON Web Tokens).
- **Task Management**: Create, update, retrieve, and delete tasks.
- **Database Support**: Configurable to use H2 for in-memory testing or MySQL for production.

## Technologies Used
- **Spring Boot**: For building the application.
- **Spring Data JPA**: For database interactions.
- **JWT**: For securing endpoints and user sessions.
- **H2 Database**: For development and testing.
- **MySQL**: For production database.

## Getting Started
1. Clone the repository:
   ```bash
   git clone https://github.com/Parshuram241-ops/taskmanager-app.git
   ```
2. Navigate to the project directory:
   ```bash
   cd taskmanager-app
   ```
3. Configure the application properties to set your database preferences (H2 or MySQL).
4. Run the application:
   ```bash
   mvn spring-boot:run
   ```

## API Endpoints
- **POST /api/auth/login**: Log in and obtain a JWT token.
- **GET /api/tasks**: Retrieve all tasks.
- **POST /api/tasks**: Create a new task.
- **PUT /api/tasks/{id}**: Update an existing task.
- **DELETE /api/tasks/{id}**: Delete a task.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
