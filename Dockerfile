# Use a base image with Maven to build the project
FROM maven:3.8.4-openjdk-11-slim AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Use a base image with Java to run the application
FROM openjdk:11-jre-slim
WORKDIR /app
COPY --from=build /app/target/*.jar /app/webApplication.jar
CMD ["java", "-jar", "webApplication.jar"]
