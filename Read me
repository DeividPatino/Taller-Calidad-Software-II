Taller Calidad de Software II - CI/CD con GitHub Actions

Este proyecto corresponde al Taller de **Calidad de Software II**, donde se implementa **integración continua (CI/CD)** usando **GitHub Actions**.
El objetivo es automatizar la construcción, pruebas y despliegue de una aplicación Java, así como simular la ejecución de los workflows en local usando **Act**.

---

 Descripción

El taller busca que los estudiantes apliquen prácticas de calidad de software mediante la integración continua.
Se trabajó con un proyecto Java, configurando un flujo de trabajo en GitHub Actions que realiza:

- Compilación del proyecto
- Ejecución de pruebas automáticas
- Generación de artefactos (build)
- Simulación local con Act

---

Requisitos previos

Antes de comenzar, asegúrate de tener instalado:

- [Java JDK 17 o superior](https://adoptium.net/)
- [Maven](https://maven.apache.org/) o [Gradle](https://gradle.org/) (dependiendo del proyecto)
- [Git](https://git-scm.com/)
- [Docker Desktop](https://www.docker.com/products/docker-desktop)
- [Act](https://nektosact.com/) (para simular workflows localmente)

---

Instalación y ejecución

1. Clonar el repositorio
```bash
git clone https://github.com/usuario/Taller-Calidad-Software-II.git
cd Taller-Calidad-Software-II

2. Compilar el proyecto con Maven
mvn clean install

3. Ejecutar pruebas
mvn test

4. Configuración de CI/CD con GitHub Actions

El flujo de trabajo está definido en:

.github/workflows/ci.yml


Cada vez que hagamos un push o un pull request a la rama main, se ejecutará automáticamente:

Compilación

Ejecución de pruebas

Generación del artefacto


5. Uso de Docker

Si nuestro proyecto genera una imagen Docker, podemos  construirla con:

docker build -t taller-calidad-software .


Y correrla con:

docker run -p 8080:8080 taller-calidad-software

6. Simulación local con Act

Podemos simular la ejecución del workflow en tu máquina usando:

act push


Cuando lo ejecutes, selecciona el tamaño de la imagen:

micro

medium

large

Ejemplo:

act push -P ubuntu-latest=catthehacker/ubuntu:act-latest

