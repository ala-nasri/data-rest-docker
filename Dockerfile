FROM gradle:7.0.1-jdk11 AS build
COPY --chown=gradle:gradle . /home/gradle/data-rest-docker
WORKDIR /home/gradle/data-rest-docker
RUN gradle build --no-daemon

FROM adoptopenjdk:11-jdk
EXPOSE 8080
RUN mkdir /delivery
COPY --from=build /home/gradle/data-rest-docker/build/libs/*.jar /delivery/app.jar
ENTRYPOINT ["java", "-Dspring.profiles.active=docker", "-jar", "/delivery/app.jar"]