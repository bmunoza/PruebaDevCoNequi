# **Prueba de automatización Nequi**

## Introducción 
Automatización mobile de una transacción desde la app nequi

## Ejecución del proyecto
Para una correcta ejecución de la automatización se debe implementar el siguiente comando:
```gradle clean users -DUS=########## -DCO=#### test aggregate -x test --info```

Nota: 
- -DUS= número de celular de la cuenta nequi
- -DCO= contraseña de la cuenta nequi

### Pre-requisitos 
- Java v1.8 update 151 o superior y JDK (variables de entorno configuradas)
- Eclipse IDE (Oxigen o Neon) o IntelliJ IDEA (2019.1)
- Gradle v4.10.2 o superior 
- Cucumber
- Appium

### Instalación 
- Para clonar este repositorio localmente, se debe ejecutar el siguiente comando: 
```git clone```
```https://github.com/bymunoz1234/PruebaDevCoNequi.git```
- Importar el proyecto desde Eclipse o IntelliJ IDE bajo la estructura de un proyecto Gradle existente 
- Configurar JRE System Library con JavaSE-1.8
- Configurar la codificación a UTF-8 al proyecto una vez sea importado



### Detalles Generales De La Implementación  
Cada línea de los escenarios de pruebas creados en el feature bajo lenguaje Gherkin, se conectan con un método de las clases StepDefinitions con la ayuda de anotaciones @Given, @When y @Then, desde el StepDefinitions se conectan con las clases tipo Task donde se realizan las acciones de alto nivel (p. ej. ingresar datos en una pantalla).

### Construido Con  La automatización fue desarrollada con : 
 - BDD - Estrategia de desarrollo
 - Screenplay 
 - Gradle
 - Cucumber
 - Serenity BDD
 - Gherkin - Lenguaje Business Readable DSL (Lenguaje específico de dominio legible por el negocio)
 - Appium
 - AppiumStudio

### Versionado
 
Se uso GIT para el control de versiones

### Autor

* **Brayan Yamid Muñoz Abuabara** - [brayan.yamid@gmail.com](#bymunoz)
