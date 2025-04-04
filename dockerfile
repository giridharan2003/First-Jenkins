# Use an official OpenJDK image as the base image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/Jenkins-0.0.1-SNAPSHOT.jar app.jar

# Expose the application port
EXPOSE 2006

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
