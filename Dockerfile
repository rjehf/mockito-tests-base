FROM openjdk:11.0.6-jdk-buster
ADD target/springboot-api-docker-0.0.1-SNAPSHOT.jar .
EXPOSE 9090
CMD java -jar springboot-api-docker-0.0.1-SNAPSHOT.jar