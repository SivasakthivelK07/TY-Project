# Use a lightweight JDK base image
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the JAR file built by Maven or Gradle into the container
COPY target/docker-jenkins.jar docker-jenkins.jar

# Expose the application's default port
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "docker-jenkins.jar"]
