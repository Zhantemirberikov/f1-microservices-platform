FROM openjdk:17
VOLUME /tmp
ADD target/driver-service-0.0.1-SNAPSHOT.jar driver-service.jar
ENTRYPOINT ["java", "-jar", "/driver-service.jar"]
