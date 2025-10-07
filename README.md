## Descripción del Proyecto

Esta aplicación es un proyecto desarrollado en Java utilizando Spring Boot y Maven. Su objetivo es [describir brevemente el propósito de la aplicación, por ejemplo: gestionar usuarios, procesar información, exponer servicios REST, etc.].

## Tecnologías Utilizadas

- Java 17+
- Spring Boot
- Maven
- [Otras dependencias relevantes, como Spring Data JPA, Spring Security, etc.]

## Estructura del Proyecto

El proyecto sigue la estructura estándar de una aplicación Spring Boot con Maven:

├── pom.xml                               # Archivo de configuración de Maven
└── src
├── main
│   ├── java
│   │   └── co.edu.unisabana.group1
│   │       ├── services               # Lógica de negocio y servicios
│               ├── EmailService.java      # Configuración de la aplicación
│   │       ├── tasks                 # Clases de dominio y entidades
│               ├── EmailScheduler.java
│   │       └── AppWsApplication.java        # Clase principal de arranque
│   └── resources
│       ├── application.properties      # Configuración de la aplicación
└── test

## Configuración y Ejecución

1. Clona el repositorio.
2. Ejecuta `mvn clean install` para compilar el proyecto.
3. Inicia la aplicación con `mvn spring-boot:run` o desde tu IDE.
4. Accede a los endpoints disponibles, por ejemplo: `http://localhost:8080/actuator/health`.

## Endpoints Actuator

La aplicación expone endpoints de Actuator para monitoreo y gestión. Ejemplos:

- `/actuator/health`
- `/actuator/info`

Asegúrate de tener configurado en `application.properties`:

