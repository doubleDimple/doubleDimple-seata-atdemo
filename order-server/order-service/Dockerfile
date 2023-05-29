FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 7897
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} order-service.jar
ENTRYPOINT ["java","-jar","/order-service.jar"]
