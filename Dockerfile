FROM openjdk:8
ADD target/docker-spring-boot-watson.jar docker-spring-boot-watson.jar
EXPOSE 9000
ENTRYPOINT ["java","-jar", "docker-spring-boot-watson.jar"]