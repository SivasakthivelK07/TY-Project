# Use an OpenJDK image as the base
FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the application's JAR file into the container
COPY target/spring-boot-docker.jar spring-boot-docker.jar

# Expose the port your Spring Boot app will run on
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "spring-boot-docker.jar"]
