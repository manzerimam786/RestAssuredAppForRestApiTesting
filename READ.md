This project is intended for develop a rest api whgich will be used by Cucumber Citrus Framework to work on Cucumber and Angular proejcts for my learning and ESI project as well

RestAssured static import for post rest api method test below
import static io.restassured.RestAssured.when;

 
This Application is working on below Spring Boot Version 1.5.10.RELEASE

For connecting to oracle
Add dependency in pom.xml and then add the jar in m2 folder inside com.oracle.....
after that goto cmd and in the project root folder execute below cmd
mvn install:install-file -DgroupId=com.oracle -DartifactId=ojdbc14 -Dversion=10.2.0.4.0 -Dpackaging=jar -Dfile=E:\ojdbc14.jar -DgeneratePom=true