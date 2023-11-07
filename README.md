# Punto de Venta


### Instalación del proyecto

> Equisitos previos

1. JDK
2. Java Maven
3. Base de datos porstgresql

> Instalación

1. Crea un proyecto Java Maven

2. Usa ```git clone https://github.com/jared0192galicia/SalePoint.git```

3. Importa el proyecto a tu IDE (NetBeans, IntelliJ) sobre escribiendo los archivos

4. Descarga las dependencias del archivo ```pom.xml``` usando la herramienta clean and build de tu IDE

5. Crea tu archvo ```.env``` para las variables de entorno en la carpeta > src/main/resources.

6. Ejecuta tu proyecto

### Variables de entorno

> Contenido general
1. ```ENVIRONMENT``` = Entorno de ejecución

> Conexion a la base de datos
1. ```USE_NAME``` = Usuario de postgresql
2. ```PASSWORD_SERVER``` = Contraseña de acceso a postgresql
3. ```DATA_BASE``` = Nombre  de la base dedatos a la que se accede

## Dependecias

* JCalendar
* Java-DotEnv
* Timing Framework
* MigLayout
* Driver Postgresql