# Proyecto Testing Moneda Paises SpringBoot Java 24

# 🌍 Lista de Países, Códigos de Moneda y Monedas (ISO 4217)

Este repositorio contiene un proyecto realizado con Spring Boot que reraliza una busqueda en un archivo o CSV con la información oficial de **países**, **códigos de moneda (ISO 4217)** y **nombres de monedas** en español.  
Es un recurso útil para proyectos de desarrollo de software, aplicaciones financieras, sistemas de conversión de divisas, y análisis de datos.


## Estructura:
monedas/
├── src/
│   └── main/
│       ├── java/com.example.currency/
│       │   ├── CurrencyRecord.java
│       │   ├── CurrencyService.java
│       │   └── CurrencyController.java
│       └── resources/
│           ├── templates/
│           │   └── search.html
│           └── data.csv
├── pom.xml


## 📂 Archivo incluido

  


### Formato del CSV

```csv
codigo,moneda,pais
USD,Dólar estadounidense,Estados Unidos
EUR,Euro,Unión Europea
JPY,Yen japonés,Japón
GBP,Libra esterlina,Reino Unido
...


