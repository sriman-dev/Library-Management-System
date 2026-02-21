# Library-Management-System

Project Overview

The Library Management System is a console-based Java application developed using Spring Core.
This project demonstrates core Spring concepts such as Dependency Injection (DI), Inversion of Control (IoC), and layered architecture by implementing a simple library system to manage books and users.

🔹 Features

Add and view books

Register library users

Borrow books

Return books

Display available books

Layered architecture using Service and Repository layers

🔹 Technologies Used

Java

Spring Core

Maven (if used)

OOP concepts

Annotation-based configuration

🔹 Spring Concepts Implemented

Dependency Injection (DI)

Inversion of Control (IoC)

@Component, @Service, @Repository

@Autowired annotation

Java-based configuration using @Configuration and @ComponentScan

Layered architecture (Service → Repository)

🔹 Project Structure
Library-Management-System
│
├── config
│   └── AppConfig.java
│
├── model
│   ├── Book.java
│   └── User.java
│
├── repository
│   ├── BookRepository.java
│   └── UserRepository.java
│
├── service
│   ├── BookService.java
│   ├── UserService.java
│   └── LibraryService.java
│
└── App.java (Main class)
🔹 How to Run the Project

Clone the repository

git clone https://github.com/yourusername/library-management-system.git

Open project in Eclipse/IntelliJ

Run:

App.java

Output will show:

Books added

User registered

Borrow & return operations

🔹 Sample Output
Book [id=1, title=Spring Core, available=true]
Book [id=2, title=Java Basics, available=true]
Book borrowed successfully
Book returned successfully
🔹 Learning Outcomes

Understanding of Spring Core fundamentals

Implementation of Dependency Injection

Writing clean layered Java applications

Hands-on practice with annotations and configuration

🔹 Future Enhancements

Add database (MySQL)

Spring Boot REST API

Web interface (React/HTML)

Login system

Issue tracking for books

🔹 Author

Your Name
GitHub: https://github.com/yourusername
