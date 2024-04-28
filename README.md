# Backend Services PokeAPI
Este es un proyecto desarrollado como parte de un test técnico para el manejo de servicios SOAP relacionados con la PokeAPI.

## Descripción 
El proyecto Backend Services PokeAPI es una aplicación desarrollada en Java utilizando Spring Boot. Tiene como objetivo principal demostrar el consumo y manejo de servicios SOAP mediante la integración con la PokeAPI.

## Requisitos
- Java Development Kit (JDK) 17
- Maven
- Conexión a Internet para acceder a los servicios SOAP de la PokeAPI
- Instalación y Uso
- Clona este repositorio en tu máquina local.
- Abre el proyecto en tu IDE de preferencia (se recomienda IntelliJ IDEA o Eclipse).
- Asegúrate de tener configurado JDK 17 como tu JDK por defecto.
- Compila el proyecto utilizando Maven.

## Instalación y Uso 
1. Clona este repositorio en tu máquina local.
2. Abre el proyecto en tu IDE de preferencia (se recomienda IntelliJ IDEA o Eclipse).
3. Asegúrate de tener configurado JDK 17 como tu JDK por defecto.
4. Compila el proyecto utilizando Maven.
```
mvn clean install
```
5. Ejecuta la aplicación.
```
mvn spring-boot:run
```
6. La aplicación estará disponible en http://localhost:8080
7. Para generar el wsdl se puede consultar en http://localhost:8080/pokeapi/pokemons.wsdl
8. el archivo **demo-soapui.xml** se puede importar en soap ui

## License

MIT
