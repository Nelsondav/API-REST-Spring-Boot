API REST completa utilizando Spring MVC
Este proyecto es una API REST completa construida con el framework Spring MVC. Proporciona operaciones CRUD (Crear, Leer, Actualizar, Eliminar) para interactuar con una base de datos H2 utilizando Spring Data JPA. La aplicación también implementa el manejo de errores utilizando el controllerAdvice de Spring, lo que garantiza respuestas coherentes y amigables en caso de producirse errores.

Tecnologías utilizadas
Spring MVC: Framework de desarrollo web utilizado para construir la API REST.
Base de datos H2: Base de datos embebida utilizada para el almacenamiento de datos.
Spring Data JPA: Biblioteca que facilita el acceso a la base de datos utilizando el enfoque de mapeo objeto-relacional (ORM).
ControllerAdvice de Spring: Mecanismo proporcionado por Spring para manejar errores de manera centralizada y consistente en toda la API.
Swagger: Herramienta para la documentación de la API, generando automáticamente una interfaz interactiva y legible para los desarrolladores.
Mappers y DTOs: Se utilizan mappers y objetos de transferencia de datos (DTOs) para separar las entidades de la base de datos de los objetos enviados y recibidos por la API, mejorando la modularidad y seguridad de la aplicación.
Requisitos
