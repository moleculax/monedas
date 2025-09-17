# Proyecto Testing Moneda Paises SpringBoot Java 24

# 🌍 Lista de Países, Códigos de Moneda y Monedas (ISO 4217)

Este repositorio contiene un proyecto realizado con Spring Boot que reraliza una busqueda en un archivo o CSV con la información oficial de **países**, **códigos de moneda (ISO 4217)** y **nombres de monedas** en español.  
Es un recurso útil para proyectos de desarrollo de software, aplicaciones financieras, sistemas de conversión de divisas, y análisis de datos.


## Estructura:
```text
monedas/
├── src/
│   └── main/
│       ├── java/com.anamuc.monedas/
│       │   ├── controller 
│		    │	│		CurrencyRecord.java
│       │   ├── modelo
│		    │	│		paises.java
│       │   └── services
│		    │		 CurrencyService.java
│       └── resources/
│           ├── templates/
│			      │ 	error/
│			            │__		error.html
│           │   
│           └── monedasPaises.csv
│			└── search.html
├── pom.xml

```
** Ejecute y visualice **
http://localhost:8080/

![Pantallazo](https://github.com/moleculax/monedas/blob/main/src/main/resources/templates/pantalla.png)
## 📂 Archivo incluido

  


### Formato del CSV

```csv
codigo,moneda,pais
USD,Dólar estadounidense,Estados Unidos
EUR,Euro,Unión Europea
JPY,Yen japonés,Japón
GBP,Libra esterlina,Reino Unido
```

[Visita mi Blog ](https://moleculax.blogspot.com)

