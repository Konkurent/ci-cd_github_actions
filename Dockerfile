FROM openjdk:17-jdk-slim
LABEL authors="javaman"
EXPOSE 8080

WORKDIR app

COPY example-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]