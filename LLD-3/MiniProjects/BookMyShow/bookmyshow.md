# SQL Queries for creating new DB

- For connecting SpringBoot with the DB we add connection data in application.properties file
- But before connecting springboot with the DB, you must follow this
  - Install MySQl
  - Install Dbeaver/MySQL workbench
  - Create a user
    - CREATE USER 'username'@'localhost' IDENTIFIED BY 'password';
  - Grant permissions
    - GRANT ALL PRIVILEGES ON * . * TO 'username'@'localhost';
  - Create a Database
    - CREATE DATABASE databaseName;
    - USE databaseName
  - Open Dbeaver/MySql workbench.
  - I am using Dbeaver
    - Create a new connection, use same username and db name
- You are done with the DB setup in Dbeaver
- Add same data in application.properties file


# Application.properties data for MySQL

- spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
- spring.jpa.hibernate.ddl-auto=update
- spring.jpa.properties.hibernate.show_sql=true
- spring.jpa.show-sql=true
- spring.datasource.url=jdbc:mysql://localhost:3306/bookmyshow
- spring.datasource.username=
- spring.datasource.password=




