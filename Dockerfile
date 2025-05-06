
# Базовий образ з Java 17
FROM eclipse-temurin:17-jdk-alpine

# Встановлюємо робочу директорію всередині контейнера
WORKDIR /app

# Копіюємо зібраний JAR-файл в контейнер
COPY target/*.jar app.jar

# Команда, яка запускає Spring Boot сервер
ENTRYPOINT ["java", "-jar", "app.jar"]
