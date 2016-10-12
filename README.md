# CDDB project

- Offers REST service on /cddb/rest
- Offers HTML/AngularJS client on /cddb/angularclient

This demo project consists of a CD metadata database server and a client for interacting with it. The server is written in Java and uses the Spring (4.2.4) and Hibernate (5.0.7) frameworks to manage an underlying MySQL database and expose a REST service. The client is written separately in HTML5, CSS3 and AngularJS (1.4.9) and is merely served out of the same war file. The two communicate through HTTP verbs and pass JSON objects to each other. The project runs on an Apache Tomcat server. The database structure is included in src/main/resources/database.sql

The backend is the focus today. It contains four packages.
The dao packages contains "data access objects" which are the bottom layer 
closest to the database. The service package contains the business logic 
which determines the behavior of the program. The rest package contains a 
rest-controller, which exposes the data to the outside world and allows CRUD 
operations via HTTP for albums and tracks. The util package contains a data importer 
which allows you to import album and track info from CSV files in the resources folder. 

Start the application with the tomcat7:run command. You can approach the backend 
[here](localhost:8080/cddb/rest) and the Angular client [here](localhost:8080/cddb/angularclient).