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
1. ```USER_NAMER``` = Usuario de postgresql
2. ```PASSWORD_SERVER``` = Contraseña de acceso a postgresql
3. ```DATA_BASE``` = Nombre  de la base dedatos a la que se accede
4. ```PU_NAME``` = Nombre de la unidad de persistencia utilizada

> Servicio de correos
1. ```MAIL_HOST``` = Direccion de correo electronico para ser usada por el sistema
2. ```MAIL_PASSWORD```= Contraseña del correo del sistema

## Dependecias

* JCalendar
* Java-DotEnv
* Timing Framework
* MigLayout
* Driver Postgresql
* Jasperreports
* Mail
* Eclipse persistence
* Apache POI

### Estandar de desarrollo

1. El nombre las variables debe ser en ingles
2. Comentar los metodos y procesos complejos en español
3. Las variables deben empesar con minuscula y primera letra de la segunda palabra en mayuscula. Ejemplo ```unoDos```
4. No renombrar ningun archivo, en caso de querer hacerlo avisar antes.
5. Por cada commit creado crear un Pull Request en gitHub
