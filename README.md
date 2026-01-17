# Springboot-Testing Repository

This repository contains **two Spring Boot applications**.  
Each application is designed, implemented, and **tested separately** to demonstrate real-world backend development and testing best practices.

---

## 📁 Repository Structure

```
Springboot-Testing/
│
├── posting.socials/
│   ├── src/main/java
│   ├── src/test/java
│   ├── pom.xml
│
├── springboot-testing/
│   ├── src/main/java
│   ├── src/test/java
│   ├── pom.xml
│
└── README.md
```

---

## 🚀 Applications Overview

## 1️⃣ posting.socials – Social Media Backend Application

`posting.socials` is a **standalone Spring Boot backend application** that implements a social-post system with authentication and authorization.

### ✨ Features
- User signup & login
- JWT-based authentication
- Create, update & delete posts
- User-specific post access
- Global exception handling
- Consistent API response structure

### 🔐 Security
- JWT authentication using `OncePerRequestFilter`
- Token validation on protected routes
- Spring Security integration

### 🛠 Tech Stack
- Java 17
- Spring Boot
- Spring Security + JWT
- Spring Data JPA
- Hibernate
- ModelMapper
- Lombok
- H2 / MySQL

### 🧪 Testing
- Controller tests
- Service-layer tests
- Repository tests
- Security-aware test cases

Run tests:
```bash
cd posting.socials
./mvnw test
```

---

## 2️⃣ springboot-testing – Testing-Focused Application

`springboot-testing` is a ** Spring Boot application** created specifically to practice and demonstrate **Spring Boot testing strategies**.


### 🎯 Focus Areas
- Writing clean and maintainable tests
- Testing Spring Security protected APIs
- Layer-wise testing (Controller, Service, Repository)

### 🧪 Test Coverage
- Repository tests (`@DataJpaTest`)
- Service-layer tests
- Controller tests
- Authentication & authorization tests
- Exception handling tests

### 🛠 Tech Stack
- Java 17
- Spring Boot
- Spring Security
- Spring Data JPA
- H2 Database
- JUnit 5
- Mockito
- WebTestClient

Run tests:
```bash
cd springboot-testing
./mvnw test
```

---

## 📊 Code Coverage (JaCoCo)

Both applications support **JaCoCo code coverage**.

Generate report:
```bash
./mvnw clean test
```

View report:
```
target/site/jacoco/index.html
```

---

## 🧠 Key Learnings

- Spring Security with JWT from scratch
- Building production-ready REST APIs
- Global exception & response handling
- Testing secured endpoints
- Writing maintainable test cases

---

## 👨‍💻 Author

**Shreyash Gurav**  
Java | Spring Boot | Backend Developer  

GitHub: https://github.com/Shreyash-03-codes
