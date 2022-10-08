# https://hub.docker.com/_/maven
FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} play-integrity-service.jar
ENTRYPOINT ["java","-jar","/play-integrity-service.jar"]