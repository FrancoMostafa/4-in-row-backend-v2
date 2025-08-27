# 4 en Línea - Backend v2

## Descripción

Versión optimizada del backend del clásico juego "Cuatro en línea" desarrollado con Spring Boot. Esta versión v2 incluye mejoras en arquitectura, rendimiento, validación y mejores prácticas de desarrollo.

## Características principales

- **Juego en tiempo real** con WebSockets
- **Partidas públicas y privadas**
- **Sistema de estadísticas** completo
- **Validaciones robustas** de entrada
- **Manejo de errores** mejorado
- **Arquitectura limpia** con separación de responsabilidades
- **Base de datos MongoDB** para persistencia
- **Logging estructurado**
- **Documentación de API** con OpenAPI/Swagger

## Tecnologías utilizadas

- **Java 17** (actualizado desde Java 11)
- **Spring Boot 3.2.0** (actualizado desde 2.7.2)
- **Spring WebSocket** para comunicación en tiempo real
- **MongoDB** para persistencia de datos
- **Maven** como gestor de dependencias
- **Lombok** para reducir código boilerplate
- **MapStruct** para mapeo de objetos
- **JUnit 5** para testing

## Mejoras implementadas

### Arquitectura
- Mejor separación de responsabilidades
- DTOs para comunicación externa
- Mappers automáticos con MapStruct
- Configuración externalizada
- Manejo centralizado de excepciones

### Validación
- Validaciones de entrada robustas
- Sanitización de datos
- Manejo de errores específicos del juego

### Rendimiento
- Optimización de consultas a base de datos
- Cache en memoria para partidas activas
- Reducción de overhead en WebSockets

### Observabilidad
- Logging estructurado
- Métricas de aplicación
- Health checks

### Seguridad
- Validación de entrada mejorada
- Rate limiting
- CORS configurado apropiadamente

## Instalación y ejecución

### Prerrequisitos
- Java 17+
- MongoDB
- Maven 3.8+

### Configuración
1. Clona el repositorio
2. Configura las variables de entorno o application.properties
3. Ejecuta `mvn clean install`
4. Ejecuta `mvn spring-boot:run`

### Variables de entorno
```bash
MONGODB_URI=mongodb://localhost:27017/fourinrow
SERVER_PORT=8080
CORS_ALLOWED_ORIGINS=http://localhost:3000,https://4enlinea.vercel.app
```

## API Endpoints

### REST API
- `GET /api/statistics` - Obtener estadísticas del juego
- `GET /api/health` - Health check de la aplicación

### WebSocket Endpoints
- `/ws/home` - Lobby principal
- `/ws/game/{gameId}` - Partida específica
- `/ws/search/public` - Búsqueda de partidas públicas
- `/ws/search/private` - Búsqueda de partidas privadas

## Estructura del proyecto

```
src/main/java/com/fourinrow/
├── config/          # Configuraciones
├── controller/      # Controladores REST
├── dto/            # Data Transfer Objects
├── exception/      # Manejo de excepciones
├── mapper/         # Mappers automáticos
├── model/          # Entidades del dominio
├── repository/     # Repositorios de datos
├── service/        # Lógica de negocio
├── websocket/      # Handlers de WebSocket
└── util/           # Utilidades
```

## Changelog v2

- ✅ Actualización a Spring Boot 3.2.0 y Java 17
- ✅ Mejora en la estructura de paquetes
- ✅ DTOs y validaciones mejoradas
- ✅ Manejo centralizado de excepciones
- ✅ Logging estructurado
- ✅ Documentación de API con OpenAPI
- ✅ Tests unitarios y de integración
- ✅ Configuración externalizada
- ✅ Health checks y métricas

## Enlaces

- **Frontend**: https://github.com/FrancoMostafa/4-in-row-frontend-v2
- **Versión anterior**: https://github.com/FrancoMostafa/4-in-row-backend
- **Aplicación en vivo**: https://4enlinea.vercel.app

## Contribuciones

Las contribuciones son bienvenidas. Por favor, abre un issue primero para discutir los cambios que te gustaría realizar.

## Licencia

Este proyecto está bajo la Licencia MIT.