# Assignment-3-CRUD-API
Simple CRUD API for Student Objects with JPA (Hibernate)

Version
1.0.0

Installation
Get the project
clone
git clone: https://github.com/MarionosIntern/Assignment-3-CRUD-API.git
OR download zip.
Open the project in VS Code.
This project is built to run with jdk 21.
Dependencies to JPA and Postgres in addition to the usual Spring Web. JPA handles the persistence, Postgresql is the database to be used.
/src/main/resources/application.properties This file has the configuration for the PostgreSQL database to use for the API.
You MUST have the database up and running before running the project!
Login to your neon.tech account.
Locate your database project.
On the project dashboard, click on "Connect" and select Java.
Copy the connection string provided.
Paste it as a value for the property spring.datasource.url. No quotation marks.
Build and run the main class. You should see a new table created in the Neon database.
Notes
Java - Spring ORM with JPA and Hibernate
We are using ORM (Object-Relational Mapping) to deal with databases. This is a technique that allows us to interact with a relational database using object-oriented programming principles.
JPA (Jakarta Persistence, formerly Java Persistence API) is a specification that defines ORM standards in Java. It provides an abstraction layer for ORM frameworks to make concrete implementations.
Hibernate: Hibernate is a popular ORM framework that implements JPA. It simplifies database operations by mapping Java objects to database tables and handling queries efficiently. Spring ORM allows seamless integration of Hibernate and JPA, making database interactions more manageable and reducing boilerplate code.

