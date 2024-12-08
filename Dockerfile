# Dockerfile
FROM eclipse-temurin:17-jdk-alpine

# Робоча директорія
WORKDIR /app

# Копіюємо зібраний JAR-файл
COPY target/lab1-0.0.1-SNAPSHOT.jar app.jar

# Відкриваємо порт
EXPOSE 8080

# Команда для запуску додатка
ENTRYPOINT ["java", "-jar", "app.jar"]
