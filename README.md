# University-Event-Management

## Framework and Language Used
- Framework: Spring Boot
- Language: Java

## Data Flow
The data flow in the project follows the typical MVC (Model-View-Controller) pattern:

1. Controller: Handles incoming HTTP requests, validates inputs, and coordinates the flow of data.
2. Service: Contains the business logic of the application and interacts with the repository.
3. Repository: Provides the interface to interact with the underlying database.
4. Database: Stores the student and event entities and their related data.

## Database Design
The project uses an H2 Database, an in-memory database, for simplicity. Two tables, `students` and `events`, are created to store the student and event entities, respectively.

The `Student` entity has the following attributes:
- studentId: Long
- firstName: String
- lastName: String
- age: Integer
- department: Enum (ME, ECE, CIVIL, CSE)

The `Event` entity has the following attributes:
- eventId: Long
- eventName: String
- locationOfEvent: String
- date: LocalDate
- startTime: LocalTime
- endTime: LocalTime

## Data Structure Used in the Project
- Student: Represents a university student with various attributes and associated methods.
- Event: Represents an event with various attributes and associated methods.
- Department: Enum class that defines the different departments (ME, ECE, CIVIL, CSE).

## Project Summary
The University Event Management project is a Spring Boot-based application that provides APIs for managing university students and events.

The application allows you to perform the following operations on students:
- Add a new student
- Update the department of a student
- Delete a student
- Get a list of all students
- Get a student by their ID

For events, the following operations are supported:
- Add a new event
- Update an event
- Delete an event
- Get a list of all events on a specific date

The project leverages Spring Boot's built-in validation annotations to enforce data constraints on various fields. For example, the age should be between 18 and 25, the first name should have a capitalized first letter, and the department should be selected from a predefined set of values.
