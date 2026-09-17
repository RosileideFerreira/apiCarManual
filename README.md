# API Car Manual

## Overview
This is a Spring Boot API designed to manage users, tasks, and related entities. It provides endpoints for CRUD operations and integrates with a MySQL database.

## Features
- User management (create, read, update, delete)
- Task management linked to users
- Validation for input data
- Exception handling for common errors

## Technologies
- Java 21
- Spring Boot 3.5.4
- MySQL
- Maven

## Endpoints
### User Endpoints
- `GET /user/{id}`: Retrieve a user by ID
- `POST /user`: Create a new user
- `PUT /user/{id}`: Update an existing user
- `DELETE /user/{id}`: Delete a user

### Task Endpoints
- `GET /task/{id}`: Retrieve a task by ID
- `POST /task`: Create a new task
- `PUT /task/{id}`: Update an existing task
- `DELETE /task/{id}`: Delete a task
- `GET /task/user/{userId}`: Retrieve all tasks for a specific user

## Setup
1. Clone the repository:
   ```bash
   git clone https://github.com/RosileideFerreira/apiCarManual.git
