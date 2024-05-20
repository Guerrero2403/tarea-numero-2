Librería API
La Librería API es un proyecto de API REST desarrollado con Spring Boot que permite gestionar información sobre libros. Esta API proporciona endpoints para realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) en una base de datos de libros.

Estructura del Proyecto
El proyecto sigue una estructura de paquetes estándar de Spring Boot:

com.tuuniversidad.models: Contiene la clase Libro, que define la estructura de un libro con sus atributos como el ID, título, autor, editorial y año de publicación.
com.tuuniversidad.repository: Contiene la clase LibroRepository, que simula un repositorio de libros en memoria y proporciona métodos para realizar operaciones CRUD en la lista de libros.
com.tuuniversidad.service: Contiene la clase LibroService, que actúa como una capa intermedia entre el controlador y el repositorio, proporcionando métodos para manipular los libros.
com.tuuniversidad.controllers: Contiene la clase LibroController, que define los endpoints de la API para realizar operaciones CRUD en los libros.
Funcionalidades
La Librería API proporciona los siguientes endpoints:

GET /libros: Retorna una lista de todos los libros.
GET /libros/{id_libro}: Retorna un libro específico por su ID.
POST /libros: Crea un nuevo libro en la base de datos.
Pruebas
Se han realizado pruebas de todos los endpoints utilizando herramientas como Postman. A continuación se muestran los resultados de las pruebas:

1. Obtener todos los libros
Se realizó una solicitud GET a /libros y se recibió una lista de libros en formato JSON:


2. Obtener un libro por ID
Se realizó una solicitud GET a /libros/1 para obtener el libro con ID 1 y se recibió el siguiente libro en formato JSON:


3. Crear un nuevo libro
Se realizó una solicitud POST a /libros con los datos de un nuevo libro en formato JSON y se confirmó que el libro fue creado exitosamente:


Ejecución Local
Para ejecutar el proyecto localmente, simplemente clona el repositorio desde GitHub, importa el proyecto en tu IDE favorito y ejecútalo como una aplicación Spring Boot. Asegúrate de tener Java y Maven instalados en tu sistema.