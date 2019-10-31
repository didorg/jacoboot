## Simple java code coverage example 
> Jacoco, Spring Boot, Maven and Junit 5, JaCoCo Jenkins Plugin 

This project runs JUnit tests under code coverage and creates a coverage report (target/site/jacoco/index.html). 

run in maven: 
> `mvn clean verify`

Also this project excludes `MainApplication.class` to show how excludes/includes works (https://www.jacoco.org/jacoco/trunk/doc/report-mojo.html#excludes). 
 
 If you want, comment or remove `<configuration> <excludes>` under `<plugins>`section in the `pom.xml` and you will still have 100% code coverage because `contextLoads()` @Test is implemented. But keep in mind that there are scenarios where you don't want this behavior. Instead, `@Test void contextLoads(){...}` can be part of integration Tests. 
 
 ## JaCoCo Jenkins Plugin 
 I am going to show you how to use the JaCoCo Jenkins Plugin to achieve the same goal of jacoco-maven-plugin and have overall code coverage statistics for all modules. 
 
 The first step is installing the JaCoCo Jenkins plugin
 > Go to Jenkins -> Manage Jenkins -> Manage Plugins -> Available(tab) and find `JaCoCo plugin`
- notice that you need to have JaCoCo Maven plugin in your pom.xml, like this project. 
> Add `Post-build Actions` to the job responsible for packaging the application. -> `Record JaCoCo coverage report`. 

#### Important
for simplicity you can use this project. 
> Install and configure Jenkins if you had not done so before.

> For this example, I use a maven project. If you don't have `Maven Project` option. This link can help you: 
https://stackoverflow.com/questions/45205024/maven-project-option-is-not-showing-in-jenkins-under-new-item-section-latest 

> Also you need to configure Jenkins -> Global Tool Configuration: `JDK`, `Maven` (Add Maven) 

##### The result, as shown in the image below, is something like this in `Coverage Trend` 

![image](https://drive.google.com/uc?export=view&id=1r6UsLnH1jfh4fqvaFUT6mBOaFuxV-PXn)

