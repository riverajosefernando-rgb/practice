# UI & API Automation

Este proyect de automatización esta divido en dos módulos:

- Automatizacion-E2E → Pruebas UI con Serenity + Screenplay (Gradle)
- Automatizacion-API → Pruebas API con Karate DSL (Maven)

La idea fue trabajar UI y API de forma independiente, como normalmente se hace en proyectos reales.

---

## Estructura

Practice  
│  
├── Automatizacion-E2E  
└── Automatizacion-API

---

## Automatizacion-E2E (UI)

Tecnologías usadas:

- Java 11
- Serenity BDD
- Screenplay Pattern
- Gradle
- WebDriverManager

Se automatiza un flujo completo de compra en OpenCart. Se puede agregar por posicion o por nombre, este ultimo se deja en dos steps independientes
o por medio de lista de productos ajustable
- Ir al carrito
- Checkout como invitado
- Validación de confirmación de orden

### Ejecutar pruebas UI

Desde el módulo:

```
gradlew clean test
```

El reporte se genera en:

```
build/reports/serenity/index.html
```

---

## Automatizacion-API (API)

Tecnologías usadas:

- Java 11
- Karate DSL
- Maven

Se automatiza el flujo completo del PetStore:

- Crear mascota
- Consultar por ID
- Actualizar
- Consultar por estado

Buenas prácticas aplicadas:

- URL base configurada en karate-config.js
- Endpoints centralizados
- JSON de request externos
- Variables dinámicas

### Ejecutar pruebas API

Desde el módulo:

```
mvn clean test
```

El reporte se genera en:

```
target/karate-reports/karate-summary.html
```

---

## Objetivo

Practicar una arquitectura limpia separando UI y API, usando herramientas distintas (Gradle y Maven) y aplicando buenas prácticas de mantenimiento y organización.

Proyecto creado como práctica técnica y mejora continua en automatización.