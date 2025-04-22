# Examen Spring 
## Base de datos (Codigo)
```sql
CREATE TABLE profesor (
    dni VARCHAR(20) PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL
);

CREATE TABLE asignatura (
    id SERIAL PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    descripcion TEXT
);

CREATE TABLE curso (
    id SERIAL PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    descripcion TEXT,
    profesor_dni VARCHAR(20),
    asignatura_id INT,
    FOREIGN KEY (profesor_dni) REFERENCES profesor(dni),
    FOREIGN KEY (asignatura_id) REFERENCES asignatura(id)
);

CREATE TABLE estudiante (
    dni VARCHAR(20) PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    fechaNacimiento DATE
);

CREATE TABLE matricula (
    matricula_id SERIAL PRIMARY KEY,
    estudiante_dni VARCHAR(20),
    curso_id INT,
    fechaInscripcion DATE,
    FOREIGN KEY (estudiante_dni) REFERENCES estudiante(dni),
    FOREIGN KEY (curso_id) REFERENCES curso(id)
);

```

## Tareas
1. Crear los endpoints necesarios para poder crear y consultar la informacion de las tablas `profesor`, `asignatura`, `curso`, `estudiante` y `matricula`.
2. Cada endpoint debe tener una URI con el siguiente formato `http://127.0.0.1:8080/api/v1/recurso/`. Reemplace 'recurso' con el nombre del recurso que desea tratar.
3. El endpoint para guardar un recurso debe tener el método POST y el endpoint para consultar un recurso debe tener el método GET.
4. Ejemplo de URI para guardar un profesor `http://127.0.0.1:8080/api/v1/profesor/save`
5. Ejemplo de URI para consultar un profesor por id `http://127.0.0.1:8080/api/v1/profesor/get/1`.
6. Se debe de implementar una clase ResponseBase con los atributos `code`, `message` y `data` para devolver la respuesta de los endpoints. Donde `code` es el código de estado de la operación (200, 400, 404, 500, etc), `message` es el mensaje de la operación y `data` es la información que se desea devolver.

## Profesor
1. Crear un profesor:
```json
{
    "dni": "12345678",
    "nombre": "Carlos",
    "apellido": "Gómez",
    "email": "cgomez@gmail.com"
}
```
2. Buscar el profesor creado (respuesta):
```json
{
    "code": 200,
    "message": "Profesor encontrado",
    "data": {
      "dni": "12345678",
      "nombre": "Carlos",
      "apellido": "Gómez",
      "email": "cgomez@gmail.com"
    }
}
```
## Asignatura
1. Crear una asignatura:
```json
{
    "nombre": "Matemáticas",
    "descripcion": "Curso de matemáticas básicas"
}
```
2. Buscar la asignatura (respuesta):
```json
{
    "code": 200,
    "message": "Asignatura encontrada",
    "data": {
      "nombre": "Matemáticas",
      "descripcion": "Curso de matemáticas básicas"
    }
}
```
## Curso
1. Crear un curso:
```json
{
    "nombre": "Matemáticas I",
    "descripcion": "Curso de matemáticas básicas",
    "profesor": "12345678",
    "asignatura": 1
}
```
2. Buscar el curso creado (respuesta):
```json
{
    "code": 200,
    "message": "Curso encontrado",
    "data": {
      "nombre": "Matemáticas I",
      "descripcion": "Curso de matemáticas básicas",
      "profesor": "C. Gómez",
      "asignatura": "Matemáticas"
    }
}
```
3. Update profesor en curso:
```json
{
    "profesor": "87654321",
    "asignatura": 1
}
```
4. Buscar el curso actualizado (respuesta):
```json
{
    "code": 200,
    "message": "Curso encontrado",
    "data": {
      "nombre": "Matemáticas I",
      "descripcion": "Curso de matemáticas básicas",
      "profesor": "J. Pérez",
      "asignatura": "Matemáticas"
    }
}
```
## Estudiante
1. Crear un estudiante:
```json
{
    "dni": "87654321",
    "nombre": "Juan",
    "apellido": "Pérez",
    "email": "jperez@gmail.com",
    "fechaNacimiento": "2000-10-10"
}
```
2. Buscar el estudiante creado (respuesta):
```json
{
    "code": 200,
    "message": "Estudiante encontrado",
    "data": {
      "dni": "87654321",
      "nombre": "Juan",
      "apellido": "Pérez",
      "email": "jperez@gmail.com"
    }
}
```
## Matricula
1. Crear una matricula:
```json
{
    "estudiante": "87654321",
    "curso": 1
}
```
2. Buscar la matricula creada (respuesta):
```json
{
    "code": 200,
    "message": "Matricula encontrada",
    "data": {
      "estudiante": "Juan Pérez",
      "curso": "Matemáticas I",
      "fecha": "2021-10-10"
    }
}
```

## Entrega
El nombre del proyecto debe tener el siguiente formato: `nombre_apellido_spring` (reemplaza `nombre` y `apellido` con tu nombre y apellido) y enviarlo en comprimido usando el mismo formato `nombre_apellido_spring.zip`.