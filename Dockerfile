# Imagen base con Maven y JDK 17
FROM maven:3.9.6-eclipse-temurin-17 AS build

# Carpeta de trabajo
WORKDIR /app

# Copiar todo el proyecto
COPY . .

# Compilar y correr tests
RUN mvn clean package

# Segunda etapa: imagen más ligera solo con JDK
FROM eclipse-temurin:17-jdk

WORKDIR /app

# Copiar el .jar generado de la etapa anterior
COPY --from=build /app/target/*.jar app.jar

# Ejecutar el .jar
CMD ["java", "-jar", "app.jar"]
