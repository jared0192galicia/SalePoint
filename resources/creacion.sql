CREATE Table "Company" (
  id SERIAL PRIMARY KEY,
  "name" VARCHAR NOT NULL,
  logo VARCHAR,
  descripcion VARCHAR
);

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
  fotoperfil VARCHAR NOTNULL DEFAULT '/profileDefault.png',
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

CREATE TABLE "Product"(
  id serial,
  codigoBarra VARCHAR UNIQUE,
  nombre varchar,
  precioCom float,
  precioVenta float,
  tipo VARCHAR,
  descripcion VARCHAR(25),
  numProducto INT,
  estado VARCHAR,
  disponible int,
  variante VARCHAR,
  PRIMARY KEY(id)
);

CREATE TABLE "Flavors" (
  id serial PRIMARY KEY,
  idProducto INT,
  sabor VARCHAR(50),
  FOREIGN KEY (idProducto) REFERENCES "Product" (id) ON DELETE CASCADE
);

CREATE TABLE "Sales"(
  id serial,
  idVenta int,
  idEmpleado int,
  idProducto INT,
  tipoOrden VARCHAR CHECK (tipoOrden IN ('Para llevar', 'Normal')),
  comentarios VARCHAR,
  nombreComprador VARCHAR,
  codigoBarra VARCHAR,
  fechaHora TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  estatus INT,
  PRIMARY KEY(id),
  FOREIGN KEY (idEmpleado) REFERENCES "Employee"(id),
  FOREIGN KEY (idProducto) REFERENCES "Product"(id)
);

CREATE TABLE "Expenses" (
  id serial PRIMARY KEY,
  idAccount INT,
  idAutorizo INT,
  date TIMESTAMP DEFAULT CURRENT_DATE,
  descripcion varchar,
  categoria VARCHAR CHECK (categoria IN ('Viatico', 'Otro')),
  monto float4,
  comprobante varchar,
  FOREIGN KEY (idAccount) REFERENCES "Account"(id),
  FOREIGN KEY (idAutorizo) REFERENCES "Account"(id)
);

--Trigger para disponible y estado
CREATE OR REPLACE FUNCTION actualizar_estado()
RETURNS TRIGGER AS $$
BEGIN
    IF NEW.disponible >= 0 THEN
        IF NEW.disponible = 0 THEN
            NEW.estado = 'No disponible';
        ELSIF NEW.disponible > 1 THEN
            NEW.estado = 'Disponible';
        END IF;
        RETURN NEW;
    ELSE
        RAISE EXCEPTION 'El valor de "disponible" debe ser mayor o igual a cero';
    END IF;
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER tr_actualizar_estado
BEFORE INSERT OR UPDATE
ON "Product"
FOR EACH ROW
EXECUTE FUNCTION actualizar_estado();

--Trigger para restar disponibilidad
CREATE OR REPLACE FUNCTION actualizar_disponible()
RETURNS TRIGGER AS $$
BEGIN
  UPDATE "Product"
  SET disponible = disponible - 1
  WHERE id = NEW.idProducto;

  RETURN NEW;
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER actualizar_disponible_trigger
AFTER INSERT ON "Sales"
FOR EACH ROW
EXECUTE FUNCTION actualizar_disponible();

--Script de consulta de compras
SELECT * FROM "Sales" 
LEFT JOIN "Product" ON "Product".id = "Sales".idproducto 
LEFT JOIN "Flavors" ON "Flavors".idproducto = "Product".id WHERE DATE("fechahora") = '2024-01-26';
 
 DELETE FROM "Sales" WHERE "id"=7

 UPDATE
  "Account"
SET
  fotoperfil = '/profileDefault.png'
WHERE
  fotoperfil IS NULL;
