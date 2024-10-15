# Fake Notification

## Overview

Fake Notification is a Spring Boot application designed to send fake notifications. This project uses Maven for build automation and Docker for containerization.

## Prerequisites

- Java 21
- Maven
- Docker
- Docker Compose (optional)

## Getting Started

### Build the Project

To build the project, run the following command:

```sh
make build
```

Run the Application with Maven:

```sh
make run
```

## Docker

### Build Docker Image
To build the Docker image, use:

```sh
make run
```

### Run Docker Container
To run the Docker container, execute:

```sh
make docker-run
```

### Build and Run Services
To build and run the Docker Compose services, use:

```sh
make compose-up
```

### Stop Services
To stop the Docker Compose services, execute:

```sh
make compose-down
```

## License
This project is licensed under the MIT License.