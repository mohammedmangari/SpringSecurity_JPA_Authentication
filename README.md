#  Spring Security with JPA authentication

    
   ## Overview
This project is a simple example of how to implement Spring Boot, Spring Security with JPA authentication, and MySQL from scratch. The project uses a REST Controller to demonstrate the authentication and authorization functionality.

  ## Endpoints
            /    : This endpoint is accessible by all users and returns a simple string "Welcome to home page".

          /user  : This endpoint is accessible only by logged-in users and admin, and returns a string "Welcome to user page".

          /admin : This endpoint is accessible only by admin, and returns a string "Welcome to admin page".

 ## Implementation Details
The project uses Spring Boot to create a REST API and handle dependencies. Spring Security is used to secure the endpoints and enforce authentication and authorization requirements. JPA is used to interact with a MySQL database to store user credentials and roles.

 ## Prerequisites
     - Java 8 or later
     - Maven
     - MySQL
     - An IDE of your choice

 ## Configuration
    - Before running the project, you will need to configure the database connection by updating the application.properties file located in the src/main/resources directory. The file should look like this:

        # Database connection settings
        
        spring.datasource.url=jdbc:mysql://localhost:3306/yourDatabaseName
        spring.datasource.username=username
        spring.datasource.password=password

        # Hibernate settings
        
        spring.jpa.show-sql=true
        spring.jpa.hibernate.ddl-auto=update
        spring.jpa.hibernate.naming-strategy=org.hibernate.cfg.ImprovedNamingStartegy
        
    Replace the spring.datasource.url, spring.datasource.username, and spring.datasource.password properties with your MySQL database connection details.


## How to run the project

     -  Clone the repository.
     -  Import the project into your IDE.
     -  Run the project as a Spring Boot Application.
  
