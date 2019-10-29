## Simple java code coverage example 
> Jacoco, Spring Boot, Maven and Junit 5

This project runs JUnit tests under code coverage and creates a coverage report (target/site/jacoco/index.html). 

run in maven: 
> `mvn clean verify`

Also this project excludes `MainApplication.class` to show how excludes/includes works (https://www.jacoco.org/jacoco/trunk/doc/report-mojo.html#excludes). 
 
 If you want, comment or remove `<configuration> <excludes>` under `<plugins>`section in the `pom.xml` and you will still have 100% code coverage because `contextLoads()` @Test is implemented. But keep in mind that there are scenarios where you don't want this behavior. Instead, `@Test void contextLoads(){...}` can be part of integration Tests.
