# Banking Application - REST API with Spring Boot

## Overview
This project is a simple Banking Application developed using **Spring Boot**, **Spring Data JPA (Hibernate)**, and **MySQL**. It provides essential banking functionalities, allowing users to manage their bank accounts through a RESTful API. The application is designed to be scalable, maintainable, and secure.

## Key Features
- **Create Bank Account**: Allows users to seamlessly create new bank accounts with required validation.
- **Fetch Account Details**: Retrieve comprehensive details of specific bank accounts using unique identifiers.
- **Deposits and Withdrawals**: Perform transactions including deposits and withdrawals.

## Technologies Used
- **Spring Boot**: Framework for building production-ready Java applications.
- **Spring Data JPA (Hibernate)**: Simplifies database interactions and implements the repository pattern for ORM.
- **MySQL**: Reliable relational database management system.
- **Postman**: Tool for API testing.

## Installation and Setup
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/guteingenieur/banking-application.git
    ```
2. Navigate to the Project Directory:
   ```bash
   cd banking-application
    ```

3. Set Up the Database: Create a MySQL database named `banking_app`.
   ```sql
   CREATE DATABASE banking_app;
    ```

4. Run the Application:
   ```bash
   ./mvnw spring-boot:run
    ```

## API Testing
- **POST** `/accounts`: Create an account.
- **GET** `/accounts/{id}`: Fetch account details.
- **POST** `/accounts/{id}/deposit`: Make a deposit.
- **POST** `/accounts/{id}/withdraw`: Make a withdrawal.


