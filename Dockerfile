FROM openjdk:17
ARG JAR_FILE=target/*.jar
COPY ./target/ApiGateway-0.0.1-SNAPSHOT.jar apiGateay.jar
ENTRYPOINT [ "java","-jar","/apiGateay.jar" ]