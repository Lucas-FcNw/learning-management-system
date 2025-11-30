FROM eclipse-temurin:21-jdk-jammy AS build

WORKDIR /workspace

# Copia os arquivos essenciais
COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .
COPY src src

# Roda o build direto (sem criar settings.xml complexo)
RUN chmod +x mvnw && ./mvnw -B -DskipTests package

# Fase Final
FROM eclipse-temurin:21-jre-jammy
WORKDIR /app
COPY --from=build /workspace/target/*.jar app.jar
EXPOSE 8080
ENV JAVA_OPTS="-Xms256m -Xmx512m"
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar -XX:+UseContainerSupport -XX:MaxRAMPercentage=75.0 /app/app.jar"]