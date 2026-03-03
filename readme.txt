Proyecto: Automatización E2E OpenCart

Tecnologías:
- Java 11
- Gradle
- Serenity BDD
- Screenplay
- WebDriverManager
- Lombok
- Bonigarcia (Descarga driver de Chrome dependiendo de la verion del navegador)

Ejecución:

1. Instalar Java 11 y gradle (Recuerde configurar variables de entorno)
2. Clonar el repositorio
3. Ejecutar: gradle clean test aggregate
4. Abrir reporte en:
   build/reports/serenity/index.html

Flujo automatizado:
- Agregar dos productos (Se puede agregar por posicion o por nombre, este ultimo se deja en dos steps independientes
o por medio de lista de productos ajustable
- Ir al carrito
- Checkout como invitado
- Validación de confirmación de orden