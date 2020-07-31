This project is intended for develop a RestAssured Application which will test a rest api. It is only for my learning.

Issue: 1
RestAssured static import for post rest api method test below
import static io.restassured.RestAssured.when;

 
This Application is working on below Spring Boot Version 1.5.10.RELEASE

Issue: 2
For connecting to oracle
Add dependency in pom.xml and then add the jar in m2 folder inside com.oracle.....
after that goto cmd and in the project root folder execute below cmd
mvn install:install-file -DgroupId=com.oracle -DartifactId=ojdbc14 -Dversion=10.2.0.4.0 -Dpackaging=jar -Dfile=E:\ojdbc14.jar -DgeneratePom=true