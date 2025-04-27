FROM openjdk:17
VOLUME /tmp
ADD target/race-service-0.0.1-SNAPSHOT.jar race-service.jar
ENTRYPOINT ["java", "-jar", "/race-service.jar"]
