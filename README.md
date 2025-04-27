# F1 Microservices Platform 🏎️

This project simulates a Formula 1 race management system using a microservices architecture.  
It is built with Java Spring Boot, PostgreSQL, Eureka Service Discovery, API Gateway, and Docker Compose.

---

## 🚀 Project Structure

- **Eureka Server** — Service discovery for microservices.
- **API Gateway** — Entry point for routing requests to different services.
- **Driver Service** — Manages driver information.
- **Team Service** — Manages racing teams.
- **Race Service** — Manages races and race results.
- **PostgreSQL** — Database for services.
- **Docker Compose** — Container orchestration for all services.

---

## 📦 Technologies Used

- Java 17
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Eureka Server (Netflix OSS)
- Spring Cloud Gateway
- Docker & Docker Compose

---

## 📚 How to Run the Project

1. **Build the services**:
    ```bash
    ./mvnw clean install -DskipTests
    ```
2. **Start all services with Docker Compose**:
    ```bash
    docker compose up --build
    ```

3. **Access Eureka Dashboard**:
    - http://localhost:8761

4. **Access API Gateway**:
    - http://localhost:8080

---

## 🔥 Example Postman Requests

- **Create a new driver**:
    ```json
    {
      "id": 1,
      "name": "Max Verstappen",
      "nationality": "Dutch",
      "age": 26,
      "team": "Red Bull Racing"
    }
    ```

- **Create a new team**:
    ```json
    {
      "id": 1,
      "name": "Red Bull Racing",
      "country": "Austria"
    }
    ```

- **Create a new race with results**:
    ```json
    {
      "name": "Monaco Grand Prix",
      "location": "Monaco",
      "date": "2025-05-25",
      "results": [
        {
          "driverName": "Max Verstappen",
          "position": 1
        },
        {
          "driverName": "Lewis Hamilton",
          "position": 2
        }
      ]
    }
    ```

---

## 📈 Future Improvements

- Add authentication and authorization (JWT)
- Implement centralized logging with ELK Stack
- Create front-end (React.js) to visualize race results
- Kubernetes deployment (optional)

---

## 🧠 Author

Created with ❤️ by [Zhantemir Berikov](https://github.com/Zhantemirberikov)

---
