# Spring Boot

Spring boot projects have an area for:
1. Source code
2. Resources
3. Application tests

Project path
src/main/java/**groupid**/**artifactid**/Application.java

inside artifactid folder is where your project code runs

src/main/resources
Contains the application resources such as:
1. Static: Images, CSS, Static HTML
2. Templates: dynamic web contents such as HTML templates
3. Application.properties: configure the settings for our application

src/test/java
contains the application tests in src/main/java/**groupid**/**artifactid**/ApplicationTests.java

## Running spring boot
```bash
mvn spring-boot:run

or

mvn clean spring-boot:run
```

to compile and runs the compiled code. The compiled classes will be saved in your target folder and then run the compiled code. If you have maven you don't have to run the maven wrapper (mvnw) just use mvn

## Client-server model
Client make request
Server respond to the request

Client will make HTTP request via the internet
Physical server is the computer that receive your request

When client make a request they need to specified the ip address and the port. The ip address identifies the physical server and the port number tells the physical server where to forward their request.

## Launching an HTTP server

If you are using the same computer to run server and make request, the ip address will be 127.0.0.1. This means a loopback server essentially loops the request back to your computer.

## Maven dependencies
A dependency refers to a package, library, or files (jar files) that your application can use

### Central maven repo
Where your maven download your dependencies from

### Local maven repo
Inside of your computer. Once downloaded, maven puts them in your local repository

## Spring boot devtools
Autorestart the project after changes.

## Model View Controller
Spring boot follow the model view controller design

View: what the user sees
Model: data needed by the view
Controller: glues the model and view together

process
user request -> controller handles the request -> controller forward the request to a handler to fetch data -> store data inside the model -> controller send the model into the view -> handler method return the updated view

### Controller
Spring boot use annotations to create magic. They add logic to your application without any code

#### @Controller
convert a class into a controller. Become the entry point to all request
#### @GetMapping
is a handler methods that can respond to web request.
- Get request: when user want to get a resource from our spring boot app

```java
@GetMapping("/hello") // Path localhost:8080/hello
public String sayHello()
```
#### @PostMapping
#### @RequestParam

They magically add functionalities into your spring boot app