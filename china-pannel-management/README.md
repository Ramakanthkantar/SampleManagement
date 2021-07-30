Sample-Management-Microservice
Spring Framework Sample Services Project for JADE

The project is comprised of the following:

Spring Boot: Spring-powered, production-grade applications and services with minimum fuss
Spring Data: Data Access using Oracle
Swagger: Automated JSON API documentation for Spring APIs
Junit: Unit Tests
Mockito: Dependency Mocks
Maven: Builds
Dependencies on other services

How-to: run services locally 

Install Java and Maven
Apache Maven is a software project management and comprehension tool. Based on the concept of a project object model (POM), Maven can manage a project's build, reporting and documentation from a central piece of information.

Instructions to install it can be found (here)[https://maven.apache.org/index.html]

Install Docker and Docker compose
In order to build and push an image to aws you will need to have (docker)[https://docs.docker.com/get-docker/] and (docker compose)[https://docs.docker.com/compose/install/] installed .

Generate runlocal executable for the desired stage
alpha is used as example, bdd and developers own stages can be also used (in future)

ON WINDOWS:

Install dev dependencies for python scripts pipenv install --dev
to generate set AWS_PROFILE=platone-onep and pipenv run bin\gen-runlocal.py -s alpha
to run bin\runlocal-alpha.bat
ON LINUX/MAC:

IMPORTANT: This process will not work for dev, stable, production as they

Running the application locally using eclipse

Build the project using Maven
mvn clean install
mvn package
mvn spring-boot:run 

Check for Java 8 compliance
The Unit test: 100% code coverage (Controller, Service, Client, Repository) -- and check for failures
Repository must return List, Set, Optional
Check for code warnings, unless unavoided (in this case must be suppressed)
Exception must be mapped to HttpStatus and provided brief reason
Http Status code to follow this specification
Logging is properly supplied according to this standard
Author's name and date in new files
Finally, if this is a new feature, it must have an entry in the feature section here
Oracle DB Table Definitions
[Table Name] idt_surveys - Logs all the Survey Details
[Table Name] msp_sample_jobs - Logs all the SampleJob details
[Table Name]  idt_status_codes- Logs all the Status of the sample jobs



How-to: Try its Endpoints
All endpoints are listed in its Swagger.

The following are the major features of this endpoint:

Code coverage
Run mvn clean test in order to get the jacoco plugin to generate code coverage. The results will be stored in the target/coverage-reports.

At this point we just need to run the sonarqube command to simulate the maven-build.yml step to publish on sonarqube.

mvn sonar:sonar -Dsonar.projectKey=PFL-Lifepoints -Dsonar.projectName=PFL-Lifepoints -Dsonar.host.url=http://localhost:9000

References
Spring Mvc
Spring Boot and Tutorial
Spring Data and DynamoDB & hash range key Implementation
Springfox and Tutorial
Reactor 3 and Sample Usage
Jackson Annotations
Yaml
Git