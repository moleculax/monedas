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
## Tecnologías
- Java 24
- Spring Boot 3.5.x
- Thymeleaf 3
- Bootstrap


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

###  
[![LinkedIn](https://img.shields.io/badge/LinkedIn-%230A66C2.svg?logo=linkedin&logoColor=white)](https://www.linkedin.com/in/moleculax) [![Instagram](https://img.shields.io/badge/Instagram-%23E4405F.svg?logo=instagram&logoColor=white)](https://www.instagram.com/moleculax)   [![Build with ❤️](https://img.shields.io/badge/built%20with-%E2%9D%A4-red)]() [![Status](https://img.shields.io/badge/status-en%20evolución-8A2BE2)]()  [![Debian](https://img.shields.io/badge/Debian-A81D33.svg?logo=debian&logoColor=white)](https://www.debian.org/) 


 “Cada sistema tiene errores. Cada error, una historia. Cada historia, una evolución.”
###

