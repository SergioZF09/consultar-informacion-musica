<h1>:musical_note: Consulta información sobre artistas y canciones :musical_note:</h1>



https://github.com/user-attachments/assets/4da1d7e1-8a8f-4527-afcb-2e20384a4145



# Insignias

<div align="center">
    <img src="https://img.shields.io/badge/Estado-Concluido-green">
    <img src="https://img.shields.io/badge/java_jdk-v21-blue">
    <img src="https://img.shields.io/badge/base de datos-postresql-blue">
    <img src="https://img.shields.io/badge/framework-spring boot-blue">
    <img src="https://img.shields.io/badge/version-v1.0.0-green">
</div>

# Índice

- [Insignias](#insignias)

- [Descripción del proyecto](#descripción-del-proyecto)

- [Estado del proyecto](#estado-del-proyecto)

- [Demostración de funcionalidades](#demostración-de-funcionalidades)

    - [Funcionalidades del proyecto](#funcionalidades-del-proyecto)

- [Teconologías utilizadas](#teconologías-utilizadas)

- [Personas Desarrolladoras del Proyecto](#personas-desarrolladoras-del-proyecto)

# Descripción del proyecto

Es una aplicación en consola donde se puede agregar y mostrar información sobre artistas y canciones de dichos artistas. Por ejemplo, puedes agregar información del artista e información de la canción siempre y cuando exista un artista registrado, y mostrar todos los artistas y todas las canciones que estén registradas en la base de datos.

Además, está la opción de buscar una canción con el nombre del artista (tanto nombre completo como una parte del nombre) solo si está registrado dicho artista en la base de datos, y está también la opción de buscar diversas canciones con el nombre del género.

# Estado del proyecto

:white_check_mark: Proyecto compleado

# Demostración de funcionalidades

## Funcionalidades del proyecto

- `Funcionalidad 1`: Tiene una conexión con una base de datos de PostgreSQL, la configuración está estructurado diferente para proteger de los datos reales.

- `Funcionalidad 2`: Tiene una opción para agregar un artista con los siguientes campos: nombre del artista, tipo de artista (tiene una lista de tipos para introducir) y su fecha de nacimiento en años.

- `Funcionalidad 3`: Tiene una opción para agregar una canción de un artista, pero solo funciona cuando dicho artista está registrado. Los campos son los siguientes: nombre de la canción, nombre de la banda (o del artista), nombre del álbum, nombre del género y su fecha de lanzamiento en años.

- `Funcionalidad 4`: Tiene una opción para buscar una canción introduciendo el nombre del artista (ya sea completo o un extracto) ya que la canción está relacionada con dicho artista. Primero muestra una lista de los nombres de los artistas registrados, después al introducir el nombre del artista y dar enter mostrará el nombre del artista buscado y los datos de sus canciones.

- `Funcionalidad 5`: Muestra una lista con toda la iformación de los artistas.

- `Funcionalidad 6`: Muestra una lista con toda la iformación de las canciones.

- `Funcionalidad 7`: Tiene una opción para buscar varias canción introduciendo el nombre del género (sólo están registrados los siguientes géneros: Rock, Pop, Heavy Metal y Hard Metal). Ingresas el nombre del género, le das enter y te muestra todos los datos de las canciones (con el nombre del artista) del género introducido.

# Teconologías utilizadas

- Java 21
- Hibernate
- Spring Boot
- Maven
- PostgreSQL

# Persona Desarrolladora del Proyecto

[<img src="https://avatars.githubusercontent.com/u/107082359?v=4" width=115><br><sub>Sergio Zuñiga Fraga</sub>](https://github.com/SergioZF09)
