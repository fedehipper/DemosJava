DROP TABLE guerrero IF EXISTS;
DROP TABLE aldeano IF EXISTS;

CREATE TABLE guerrero (
    id bigint primary key,
    nombre varchar(20),
    apellido varchar(20),
    edad int,
    habilidad varchar(20),
    rango int
);

CREATE TABLE aldeano (
    id bigint primary key,
    nombre varchar(20),
    apellido varchar(20),
    edad int,
    cultivo varchar(20)
);

INSERT INTO guerrero 
(id, nombre  , apellido, edad, habilidad       , rango) VALUES
(1 , 'carlos', 'calvo' , 22  , 'cortar cabezas', 1    ),
(2 , 'juan'  , 'garcia', 25  , 'cortar brazos' , 2    );

INSERT INTO aldeano
(id, nombre, apellido, edad, cultivo) VALUES
(1, 'julieta', 'granola', 20, 'tomates');
