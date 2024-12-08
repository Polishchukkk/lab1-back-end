# HealthCheck App

## Опис
Проект реалізує простий ендпоінт `/healthcheck`, який повертає статус сервісу та поточну дату.

## Запуск локально
1. Встановіть JDK 17.
2. Запустіть проект командою:
   ```bash
   ./mvnw spring-boot:run
   ``` 
Відкрийте браузер і перейдіть на http://localhost:8080/healthcheck.

Запуск через Docker

Зберіть Docker-образ:
```bash
docker build -t healthcheck-app .
```
Запустіть контейнер:
```bash
docker-compose up
```
Деплой на Render.com
Проект задеплоєний за адресою: [https://lab1-back-end.onrender.com/healthcheck].
