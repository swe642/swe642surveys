#SpringBoot Application
FROM openjdk:17
COPY /target/*.jar /usr/app/app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/usr/app/app.jar", "--spring.profiles.active=docker"]