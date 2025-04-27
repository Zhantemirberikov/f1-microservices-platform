FROM openjdk:17
VOLUME /tmp
ADD target/team-service-0.0.1-SNAPSHOT.jar team-service.jar
ENTRYPOINT ["java", "-jar", "/team-service.jar"]
