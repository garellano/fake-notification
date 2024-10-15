# Build the project
build:
	mvn clean package

# Build the Docker image
docker-build:
	docker build -t fake-notification:latest -f docker/Dockerfile .

# Run the Docker container
docker-run:
	docker run -p 8080:8080 fake-notification:latest

# Build and run Docker Compose services
compose-up:
	docker-compose up --build

# Stop Docker Compose services
compose-down:
	docker-compose down

# Run the Spring Boot application with Maven
run:
 mvn spring-boot:run