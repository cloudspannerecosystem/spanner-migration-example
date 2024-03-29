# Dockerfile
FROM maven:3.8.4-openjdk-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -Dcheckstyle.skip

FROM openjdk:17
WORKDIR /app
COPY --from=build /app/target/during-migration-example-0.0.1-SNAPSHOT-jar-with-dependencies.jar app.jar
