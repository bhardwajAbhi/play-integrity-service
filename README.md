# Getting Started

### Reference Documentation

For further reference, please consider the following sections:

* [Download and Install Java 8+ (Java 17 is Recommended)](https://www.oracle.com/java/technologies/downloads/#java17)
* [Setup Firebase](https://firebase.google.com/docs/admin/setup) or Just follow the following steps
  to [Initialize the SDK, Create and Download Firebase Credentials JSON File](https://firebase.google.com/docs/admin/setup#initialize-sdk)
    * After JSON file is downloaded, copy the content of downloaded file and replace **play-integrity-credentials.json**
      content
      with that copied text
    * Replace **application-name** value in application.yml file with **project_id** variable that is in
      **play-integrity-credentials.json**
    * [HELPFUL LINK BUT IT SHOULD NOT BE NEEDED](https://stackoverflow.com/a/40799378)
* [Google Play Integrity API](https://developer.android.com/google/play/integrity)

* Endpoints:
    * [Localhost Swagger Url](http://localhost:8080/swagger-ui.html#/)
    * GET http://localhost:8080/validations/play-integrity/nonce
    * POST http://localhost:8080/validations/play-integrity/verify-token

* [How to Install and Run Docker Image (OPTIONAL)](https://spring.io/guides/topicals/spring-boot-docker/)
    * [Download and Install Docker](https://docs.docker.com/get-docker/)
    * Run the following commands in the DockerFile path to run the Spring Boot Project:
        * mvn clean install
        * docker build -t mb/play-integrity-service .
        * docker run -p 8080:8080 --name play-integrity-service mb/play-integrity-service

### Guides

The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
