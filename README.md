# CDDB demo project

- Offers REST service on /cddb4/rest
- Offers HTML/AngularJS client on /cddb4/angularclient

This demo project consists of a CD metadata database server and a client for interacting with it. The server is written in Java and uses the Spring (4.2.4) and Hibernate (5.0.7) frameworks to manage an underlying MySQL database and expose a REST service. The client is written separately in HTML5, CSS3 and AngularJS (1.4.9) and is merely served out of the same war file. The two communicate through HTTP verbs and pass JSON objects to each other. The project runs on an Apache Tomcat server (8.0). The database structure is included in src/main/resources/database.sql

Additionally, the following tools have been used in development:
- Git (naturally)
- Maven
- LogBack
- Bower
- NPM
- Grunt
- Eclipse (server)
- Netbeans (client)

Project status
- REST service fully exposed by server
- REST service fully consumed by client

Possible refactoring (server):
- only one service for albums/tracks
- move validation over to service
- use external validator instead of @valid annotations

Possible refactoring (client):
- The controller needs to be split up badly, it now combines view operations for albums and tracks and CRUD operations for both as well.
- The entire client is served out of One Index.html To Rule Them All, so that could do with some splitting as well

Possible extra development:
- add security / login




