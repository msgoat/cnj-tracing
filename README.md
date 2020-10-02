# cnj-tracing

Showcase demonstrating cloud native tracing in a Kubernetes cluster.

The actual integration of cluster tracing is demonstrated with four different Java backend technologies:

* Java EE (see: [cnj-tracing-backend-javaee](cnj-tracing-backend-javaee/README.md))
* Eclipse MicroProfile (see: [cnj-tracing-backend-micro](cnj-tracing-backend-micro/README.md))
* Spring Boot + Spring Data (see: [cnj-tracing-backend-spring](cnj-tracing-backend-spring/README.md))
* Quarkus (see: [cnj-tracing-backend-quarkus](cnj-tracing-backend-quarkus/README.md))

All showcases use a common resources container project, which deploys all attached resources to Kubernetes (see: [cnj-tracing-resources](cnj-tracing-resources/README.md)])

## Status
![Build status](https://drone.at.automotive.msg.team/api/badges/msgoat/cnj-tracing/status.svg)

## Build this showcase 

### Prerequisites

In order to run the build, you have to install the following tools locally:
* Docker
* Docker Compose 
* Maven
* Java JDK 11   

### Run Maven

You can build all showcase applications by running Maven:
```
mvn clean install -P pre-commit-stage
```

The Maven build will create Docker images for all showcase applications and run system tests on them.