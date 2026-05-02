Proyecto POO - Contenido Audiovisual
 Descripción del Proyecto
Este proyecto implementa un sistema de gestión de contenido audiovisual utilizando Programación Orientada a Objetos en Java. Permite crear y manejar diferentes tipos de contenido como películas, series, documentales, podcasts y streaming.

---
Objetivo
Aplicar los conceptos fundamentales de la POO como:
- Herencia
- Encapsulación
- Agregación
- Composición
para modelar un sistema real de contenidos audiovisuales.
---

Clases Implementadas
- ContenidoAudiovisual (clase base)
- Pelicula
- SerieDeTV
- Documental
- Podcast
- Streaming
- Actor
- Investigador
- Temporada
---

Relaciones
- Herencia: todas las clases heredan de `ContenidoAudiovisual`
- Agregación:
  - Película → Actor
  - Documental → Investigador
  - Podcast → Investigador
  - Streaming → Actor
- Composición:
  - SerieDeTV → Temporada
---

Funcionalidades
- Crear objetos de cada tipo de contenido
- Agregar actores e investigadores
- Gestionar temporadas en series
- Mostrar detalles completos de cada contenido
---

Ejecución del Proyecto
1. Abrir el proyecto en Eclipse
2. Ejecutar la clase:
PruebaAudioVisual.java
