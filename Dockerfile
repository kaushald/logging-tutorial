# First stage: Build the Spring Boot app using the Gradle wrapper
FROM gradle:7.6.1-jdk17 AS build

# Set the working directory
WORKDIR /app

# Copy the source code and build the app
COPY . .

RUN ./gradlew clean build --no-daemon

# Second stage: Create the final image with the built JAR file
FROM openjdk:17

# Set the working directory
WORKDIR /app

# Copy the built JAR file from the first stage
COPY --from=build /app/build/libs/*.jar app.jar

# Expose the port on which the app is running
EXPOSE 8080

# Run the Spring Boot app with debug logging enabled
ENTRYPOINT ["java", "-jar", "app.jar", "--logging.level.root=DEBUG"]
