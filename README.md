# 📚 Catalogue Management

A multi-tier Spring Boot application for managing a book catalogue. It allows book collectors to create, update, view, and delete books in their personal library.

---

## 🚀 Project Overview

This solution is split into two Spring Boot services:

- **Management Service**: Exposes a REST API to manage books.
- **Web UI Service** (optional, if you're planning): Connects via JAX-RS Client and renders a web interface.

This repository contains the **Management Service** with Swagger documentation and Docker support.

---

## 🛠️ Tech Stack

- Java 17
- Spring Boot 2
- Maven
- H2 In-Memory Database
- Docker
- Swagger (Springfox)

---

## 📦 Features

- 📖 List all books
- ➕ Add new books
- 📝 Update existing books
- ❌ Delete books
- 📄 Swagger UI for API exploration

---

## ⚙️ How to Run

### 🐳 Docker (Recommended)

1. **Build the Docker image:**
   ```bash
   docker build -t catalogue-management .

2. **Run the Docker image:**
   ```bash
   docker run -p 8080:8080 catalogue-management

### 🧪 Running Locally (without Docker)

1. **Build the project to produce the jar :**
   ```bash
      mvn clean package
   
2. **Run the application:**
   ```bash
      java -jar target/CatalogueManagement-0.0.1-SNAPSHOT.jar