CREATE TABLE "Employee" (
  id serial,
  numEmpleado INT,
  nombre VARCHAR,
  apellidoP VARCHAR,
  apellidoM VARCHAR,
  fechaNac DATE,
  correo VARCHAR,
  telefono VARCHAR,
  fechaIng DATE,
  estado VARCHAR,
  puesto VARCHAR,
  PRIMARY KEY (id)
);
CREATE TABLE "Area" (
  id serial,
  nombre VARCHAR(25),
  descripcion VARCHAR(75),
  PRIMARY KEY (id)
);

CREATE TABLE "Section" (
  id serial,
  idArea INT,   
  nombre VARCHAR(25),
  descripcion VARCHAR(75),
  PRIMARY KEY (id),
  FOREIGN KEY (idArea) REFERENCES "Area"(id)
);


CREATE TABLE "Account" (
  id SERIAL,
  numCuenta INT,
  idEmpleado INT,
  usuario VARCHAR(20),
  contrasena VARCHAR(256),
  PRIMARY KEY(id),
  FOREIGN KEY (idEmpleado) REFERENCES "Employee"(id)
);

CREATE TABLE "Access" (
  id serial,
  idCuenta INT,
  idSeccion INT,
  PRIMARY KEY(id),
  FOREIGN KEY (idCuenta) REFERENCES "Account"(id),
  FOREIGN KEY (idSeccion) REFERENCES "Section"(id)
);
 
---------------------

CREATE TABLE "Supplier"(
id serial,
nombre VARCHAR,
marca VARCHAR,
PRIMARY KEY(id)
);

CREATE TABLE "Sales"(
id serial,
idEmpleado int,
sabor VARCHAR,
tipo_orden VARCHAR,
comentarios VARCHAR,
nombre_comprador VARCHAR,
codigo_barra VARCHAR,
PRIMARY KEY(id),
FOREIGN KEY (idEmpleado) REFERENCES "Employee"(id)
);

CREATE TABLE "Product"(
id serial,
nombre varchar,
precioCom float,
precioVenta float,
codigoBarra VARCHAR,
tipo VARCHAR,
descripcion VARCHAR(25),
numProducto INT,
estado VARCHAR(4),
disponible int,
variante VARCHAR,
PRIMARY KEY(id)
);
