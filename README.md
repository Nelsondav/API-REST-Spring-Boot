# API REST completa utilizando Spring MVC

Este proyecto es una API REST completa construida con el framework Spring MVC. Proporciona operaciones CRUD (Crear, Leer, Actualizar, Eliminar) para interactuar con una base de datos H2 utilizando Spring Data JPA. La aplicación también implementa el manejo de errores utilizando el controllerAdvice de Spring, lo que garantiza respuestas coherentes y amigables en caso de producirse errores.

## Tecnologías utilizadas

- Spring MVC: Framework de desarrollo web utilizado para construir la API REST.
- Base de datos H2: Base de datos embebida utilizada para el almacenamiento de datos.
- Spring Data JPA: Biblioteca que facilita el acceso a la base de datos utilizando el enfoque de mapeo objeto-relacional (ORM).
- ControllerAdvice de Spring: Mecanismo proporcionado por Spring para manejar errores de manera centralizada y consistente en toda la API.
- Swagger: Herramienta para la documentación de la API, generando automáticamente una interfaz interactiva y legible para los desarrolladores.
- Mappers y DTOs: Se utilizan mappers y objetos de transferencia de datos (DTOs) para separar las entidades de la base de datos de los objetos enviados y recibidos por la API, mejorando la modularidad y seguridad de la aplicación.

## Requisitos

Asegúrate de tener instalado lo siguiente en tu entorno de desarrollo:

- Java Development Kit (JDK) 8 o superior.
- Maven para compilar y gestionar las dependencias.
- Git para clonar el repositorio.

## Instalación y ejecución

Sigue estos pasos para configurar y ejecutar el proyecto localmente:

1. Clona el repositorio en tu máquina local:

   ```shell
   git clone https://github.com/Nelsondav/API-REST-Spring-Boot.git
   ```

2. Navega al directorio raíz del proyecto:

   ```shell
   cd AllApp
   ```

3. Compila el proyecto utilizando Maven:

   ```shell
   mvn compile
   ```

4. Ejecuta las pruebas unitarias:

   ```shell
   mvn test
   ```

5. Inicia la aplicación:

   ```shell
   mvn spring-boot:run
   ```

La API estará disponible en `http://localhost:8080`.

## Documentación de la API

La documentación de la API se genera automáticamente utilizando Swagger. Después de iniciar la aplicación, puedes acceder a la documentación a través de la siguiente URL:

```
http://localhost:8080/swagger-ui.html
```

En esta interfaz, encontrarás una descripción completa de los endpoints disponibles, los parámetros requeridos, los códigos de respuesta y otros detalles útiles para consumir la API correctamente.

## Estructura del proyecto

La estructura del proyecto sigue las mejores prácticas de desarrollo de Spring MVC:

- `src/main/java`: Contiene el código fuente de la aplicación.
  - `com.example.todoapp`: Paquete principal que contiene las clases de configuración y de inicio de la aplicación.
  - `com.example.todoapp.controller`: Contiene los controladores de la API, que manejan las solicitudes y respuestas HTTP.
  - `com.example.todoapp.service.dto`: Contiene los DTOs (objetos de transferencia de datos) utilizados para la comunicación entre la API y los clientes.
  - `com.example.todoapp.persistence.entity`: Contiene las entidades que representan los objetos almacenados en la base de datos.
  - `com.example.todoapp.exceptions`: Contiene las excepciones usadas en la API.
