FROM openjdk:17
VOLUME /tmp
ADD target/eureka-server-0.0.1-SNAPSHOT.jar eureka-server.jar
ENTRYPOINT ["java", "-jar", "/eureka-server.jar"]
