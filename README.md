# Proyecto de Gestión de Empleados

Este es un sistema de gestión de empleados que utiliza Angular para el frontend y Spring Boot para el backend. El proyecto está diseñado para gestionar información de empleados, incluyendo el registro, actualización, eliminación y consulta de datos.

## Tecnologías utilizadas

### Frontend
- **Angular**: Framework para la creación de aplicaciones web.
- **HTML5**, **CSS3**, **TypeScript**: Tecnologías base para el desarrollo del frontend.

### Backend
- **Spring Boot 2.7.18**: Framework para el desarrollo del backend.
- **Java 8 (JDK 1.8)**: Lenguaje de programación utilizado.
- **Spring Data JPA**: Para la interacción con la base de datos.

### Base de Datos
- **MySQL (versión más reciente)**: Sistema de gestión de bases de datos utilizado.

## Configuración del entorno

### Requisitos previos
1. **Node.js** y **npm** instalados en el sistema para ejecutar el proyecto Angular.
2. **Java JDK 8** instalado en el sistema para ejecutar el backend.
3. **MySQL** configurado y funcionando.

### Configuración de la base de datos
1. Abre tu herramienta de gestión de MySQL.
2. Ejecuta el siguiente comando SQL para crear la base de datos necesaria:

   ```sql
   CREATE DATABASE gestion_empleados_spring;
   ```

### Configuración del backend
1. Clona el repositorio del proyecto.
2. Asegúrate de que las dependencias de Spring Boot estén configuradas correctamente en el archivo `pom.xml`.
3. Configura las credenciales de la base de datos en el archivo `application.properties` del backend:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/gestion_empleados_spring
   spring.datasource.username=tu_usuario
   spring.datasource.password=tu_contraseña
   spring.jpa.hibernate.ddl-auto=update
   ```

4. Compila y ejecuta el proyecto Spring Boot:

   ```bash
   mvn spring-boot:run
   ```

### Configuración del frontend
1. Navega al directorio del proyecto Angular.
2. Instala las dependencias del proyecto:

   ```bash
   npm install
   ```

3. Ejecuta la aplicación Angular:

   ```bash
   ng serve
   ```

4. Abre tu navegador y accede a `http://localhost:4200` para visualizar la aplicación.

## Uso del sistema
1. Una vez configurada la base de datos y ejecutados el backend y el frontend, abre el navegador en `http://localhost:4200`.
2. Regístrate como usuario para acceder al sistema.
3. Utiliza las opciones disponibles en el menú lateral para gestionar los empleados.

## Estructura del proyecto

### Frontend (Angular)
- **src/app**:
  - **components**: Contiene los componentes de la aplicación.
  - **services**: Servicios para la comunicación con el backend.
  - **models**: Definiciones de las clases de modelo utilizadas en el frontend.

### Backend (Spring Boot)
- **src/main/java**:
  - **controller**: Controladores REST para las operaciones CRUD.
  - **service**: Lógica de negocio.
  - **repository**: Interfaces para la comunicación con la base de datos.
  - **model**: Clases que representan las entidades de la base de datos.

## Características adicionales
- **Menú lateral interactivo**: Ocultar/mostrar el menú con un icono de "hamburguesa".
- **Diseño responsive**: Adaptado para dispositivos de escritorio y móviles.
- **Validación de formularios**: Los formularios incluyen validaciones en tiempo real.

## Capturas de pantalla
Incluye capturas de pantalla de la interfaz de usuario en este apartado para ilustrar el funcionamiento del sistema.

## Licencia
Este proyecto está bajo la licencia MIT. Consulta el archivo `LICENSE` para más detalles.


## Contacto
Para cualquier pregunta o problema, contacta a freddyuj0@gmail.com

