# Étape 1 : Construire l'application
FROM maven:3.9.4-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests -e

# Étape 2 : Exécuter l'application dans une image légère
FROM eclipse-temurin:17-jre-jammy
WORKDIR /app
COPY --from=build /app/target/lora-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
