
<h1>**Bank Management System**</h1>
This is a Java application that allows users to manage their bank accounts. The application uses an n-tier design with appropriate abstraction and composition techniques. It uses JDBC and MySQL for data access.

Features
The application provides the following functionalities:

Add a new customer
Add an account for a customer
Show a list of all customers and their accounts
Search for a customer by name or email
Delete a customer
Requirements
To run this application, you need to have the following installed:

Java Development Kit (JDK) 8 or later
MySQL Server 5.7 or later
MySQL Connector/J 8.0.25 or later
Usage
Clone the repository to your local machine.
Create a new MySQL database named bankdb.
Run the SQL script bankdb.sql to create the necessary tables.
Update the db.properties file with your MySQL credentials.
Compile the Java files using the command javac -cp .:mysql-connector-java-8.0.25.jar *.java.
Run the application using the command java -cp .:mysql-connector-java-8.0.25.jar BankManagementSystem.
Evaluation
The following points will be evaluated for this project:

Proper use of abstractions (interfaces)
Loosely coupled design
Exception handling
Resource management
Intuitive UI
Clean coding practices
Adherence to best practices
Please ensure that you follow these guidelines while developing your project.

License
This project is licensed under the MIT License - see the LICENSE file for details.
