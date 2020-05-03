FROM openjdk:11.0.4-jre-slim

EXPOSE 8080

COPY /target/*.jar app.jar

ENTRYPOINT ["sh","-c","java -jar app.jar"]