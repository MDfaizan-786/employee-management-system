# Employee Management System

A RESTful Employee Management System built using **Spring Boot**, **Spring Data JPA**, **Spring WEB MVC**, **Hibernate**, **MySQL**, and **Swagger UI**. This project demonstrates how to design and develop a scalable backend application using a layered architecture. It provides complete CRUD (Create, Read, Update, Delete) functionality for managing employee records efficiently. The system also incorporates best practices such as DTO usage, validation, exception handling, pagination, and API documentation, making it suitable for real-world enterprise applications.

---

## Features

* Create Employee – Add new employee records with validated input data.
* Get All Employees – Retrieve a list of all employees stored in the database.
* Get Employee by ID – Fetch a specific employee using a unique identifier.
* Update Employee – Modify existing employee details.
* Delete Employee – Remove employee records from the system.
* Search Employee by Email – Find an employee using their unique email address.
* Search Employees by Department – Retrieve employees belonging to a specific department.
* Pagination – Efficiently handle large datasets by dividing results into pages.
* Sorting – Sort employee data based on fields like name, salary, etc.
* DTO Pattern – Separate internal entity structure from API responses for better security and flexibility.
* Bean Validation – Ensure data integrity using validation annotations.
* Global Exception Handling – Centralized error handling for cleaner and consistent API responses.
* Swagger API Documentation – Interactive API documentation for easy testing and understanding.

---

## Tech Stack

* **Java 17** – Core programming language
* **Spring Boot** – Backend application framework
* **Spring Web MVC** – REST API development and request handling
* **Spring Data JPA** – Database access layer
* **Hibernate** – ORM framework
* **MySQL** – Relational database
* **Maven** – Build and dependency management
* **Lombok** – Reduces boilerplate code
* **Bean Validation (Jakarta Validation)** – Input validation
* **Swagger (OpenAPI)** – API documentation and testing
* **Postman** – REST API testing
* **Git & GitHub** – Version control and source code hosting
* **IntelliJ IDEA** – Development IDE


---

                Client
                   │
                   ▼
          Spring Web MVC
                   │
           EmployeeController
                   │
           EmployeeService
                   │
         EmployeeRepository
                   │
         Spring Data JPA
                   │
             Hibernate
                   │
                MySQL

## Project Architecture

The application follows a layered architecture to maintain separation of concerns:

```
Controller
    ↓
Service
    ↓
Repository
    ↓
MySQL Database
```

* **Controller Layer** – Handles HTTP requests and responses.
* **Service Layer** – Contains business logic and processing.
* **Repository Layer** – Interacts with the database using JPA.
* **Database Layer** – Stores persistent employee data.

---

## Project Structure

```
src
└── main
    ├── java
    │   └── com.faizan.ems
    │       ├── controller      // REST controllers
    │       ├── dto             // Data Transfer Objects
    │       ├── entity          // JPA entities
    │       ├── repository      // Database access layer
    │       ├── service         // Business logic layer
    │       ├── exception       // Custom exceptions & handlers
    │       └── EmployeeManagementSystemApplication
    └── resources
        └── application.properties // Configuration file
```

---

## REST API Endpoints

| Method | Endpoint                                | Description                                           |
| ------ | --------------------------------------- | ----------------------------------------------------- |
| POST   | /employees                              | Create a new employee with validated input data       |
| GET    | /employees                              | Retrieve all employees                                |
| GET    | /employees/{id}                         | Fetch employee details by ID                          |
| PUT    | /employees/{id}                         | Update employee information                           |
| DELETE | /employees/{id}                         | Delete an employee record                             |
| GET    | /employees/email/{email}                | Search for an employee using email                    |
| GET    | /employees/department/{department}      | Retrieve employees belonging to a specific department |
| GET    | /employees/page?page=0&size=5&sort=name | Retrieve paginated and sorted employee data           |

---

## Validation

The application uses **Bean Validation (Jakarta Validation API)** to ensure data correctness before processing:

* Name cannot be empty or null.
* Email must follow a valid email format.
* Department cannot be empty.
* Salary must be greater than zero.

These validations help prevent invalid data from being stored in the database.

---

## Exception Handling

Global exception handling is implemented to provide consistent and meaningful error responses:

* **ResourceNotFoundException** – Thrown when an employee record is not found.
* **GlobalExceptionHandler** – Handles all exceptions centrally and returns structured error responses.

This improves API reliability and debugging.

---

## Swagger Documentation

Swagger provides an interactive UI to test APIs directly from the browser.

After running the application, open:

```
http://localhost:8080/swagger-ui/index.html
```

You can explore endpoints, send requests, and view responses without using external tools.

---

## Database

* Database Used: **MySQL**
* ORM Tool: **Hibernate (via JPA)**

Example Employee Record:

```
Name       : Faizan
Email      : faizan@gmail.com
Department : IT
Salary     : 50000
```

The database schema is automatically generated using JPA/Hibernate based on entity classes.

---

## Tools Used

* IntelliJ IDEA – Development environment
* MySQL Workbench – Database management
* Postman – API testing
* Swagger UI – API documentation and testing
* Git – Version control
* GitHub – Code hosting and collaboration

---

## Future Improvements

* Implement **Spring Security** for authentication and authorization
* Add **JWT Authentication** for secure API access
* Introduce **Role-Based Authorization**
* Containerize application using **Docker**
* Add **Unit and Integration Testing**
* Deploy application on cloud platforms like AWS or Azure

---

## Author

**Md Faizan Ansari**

Java Backend Developer

GitHub:
https://github.com/MDFaizan-786
