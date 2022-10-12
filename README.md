## liquibase-with-springboot-and-maven-project

* Use Liquibase with Spring Boot to create and configure standalone Spring applications and automate your database updates. Spring Boot with build systems like Maven allows you to create Java applications started by running java -jar or war deployments.

The Liquibase Spring Boot integration ensures the application database is updated along with the application code by using Spring Boot auto-configuration and features.

>> To use Liquibase and Spring Boot:

* Install Maven and add it to your path.
## Requirements

1. Ensure you have the following Java Development Kit (JDK 8, 11, or 16).
>> Create a project by using the Spring Boot application:
If you have an existing Spring Boot project, add the liquibase-core dependency to your project pom.xml.
To manually create a new Spring Boot project, follow the Spring Boot Getting Started documentation.
To create a basic Spring Boot project, use a web-based service called Spring Initializr.
2. Enter the following information in Spring Initializer:

* Project: Maven
* Language: Java
* Spring Boot: the version you need

### Project Metadata:
* Group: com.knoldus
  * Artifact: springbootProject
  * Name: liquibase-with-springboot-and-maven-project
  * Description: Liquibase Project for Spring Boot
  * Package name: liquibase-with-springboot-and-maven-project
>> * Packaging: Jar
>>> * Java: 8, 11, or 16

3. Dependencies: Spring Data JPA and Liquibase Migration. The service lets you add your database driver dependency and any developer tool.