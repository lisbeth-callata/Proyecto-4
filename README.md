# **Sistema Bancario | NTTDATA Bootcamp**

---

## Descripción
Este proyecto forma parte del NTTDATA Bootcamp Tech Girls Power y está enfocado en el desarrollo de un sistema bancario que amplía las funcionalidades de los proyectos previos. El sistema incluye microservicios para la gestión de **Cuentas** en un entorno de base de datos no relacional, con un enfoque en calidad de código, pruebas unitarias y el uso de principios SOLID y patrones de diseño.

Este sistema utiliza **JUnit**, **Mockito**, **SonarLint**, **Checkstyle**, y **Jacoco** para garantizar la calidad del código, con especial énfasis en la cobertura de pruebas y la correcta aplicación de principios de desarrollo sostenible.

---

## Tecnologías utilizadas

- **Lenguaje de programación**: Java
- **Framework de pruebas**: JUnit, Mockito
- **Cobertura de código**: Jacoco, SonarLint
- **Herramienta de estilo de código**: Checkstyle
- **Patrones de diseño**: Se han evaluado y utilizado patrones apropiados según los principios SOLID.

---

## Funcionalidades implementadas

1. **Pruebas unitarias**: Se implementaron pruebas unitarias usando JUnit para todas las clases principales del sistema.
   - Para aquellos métodos que interactúan con dependencias externas (por ejemplo, base de datos), se utilizaron **mocks** a través de Mockito para simular el comportamiento esperado.
     ![JUNIT](https://github.com/user-attachments/assets/45939904-29f5-4917-9faf-3cba96d06566)
   
2. **Cobertura de código**: Se generó un informe de cobertura de código usando **Jacoco** y **SonarLint**, con el objetivo de asegurar que se ha alcanzado un nivel adecuado de pruebas en el código.
    ![JACOCO](https://github.com/user-attachments/assets/c487bd94-6431-417d-8603-7599872cd25e)

3. **Verificación de calidad de código**: Se aplicó **Checkstyle** para asegurar que el código sigue las mejores prácticas de estilo y convenciones establecidas.

4. **Aplicación de SOLID**: El código fue evaluado para aplicar los principios de **SOLID**, buscando que cada componente fuera modular, reutilizable y mantenible.

5. **Patrones de diseño**: Se emplearon patrones de diseño adecuados en la solución, con el fin de mejorar la estructura y la extensibilidad del código.

---

## Instalación

Sigue estos pasos para instalar y ejecutar el proyecto en tu máquina local:

1. **Clona el repositorio**:
   *git clone https://github.com/lisbeth-callata/Proyecto-4.git*
2. **Navega al directorio del proyecto:**
   *cd Proyecto-4*
3. **Dependencias:**
   Asegúrate de tener las dependencias necesarias para ejecutar el proyecto. Si se emplea Maven, instalar todas las dependencias con el comando: *mvn install*

---

## **Autor**

- [Lisbeth Callata](https://github.com/lisbeth-callata)
