DROP TABLE guerrero IF EXISTS;

DROP TABLE aldeano IF EXISTS;

DROP TABLE persona IF EXISTS;

CREATE TABLE persona (
    id bigint primary key auto_increment,
    nombre varchar (20),
    apellido varchar (20),
    edad int,
    tipo varchar (20),
    nombre_pueblo varchar (20),
    poblacion int
);

CREATE TABLE guerrero (
    id bigint primary key auto_increment,
    habilidad varchar (20),
    rango int
);

CREATE TABLE aldeano (
    id bigint primary key auto_increment,
    cultivo varchar (20)
);

-- -----------------------------------------------------------------------------
-- persona
-- -----------------------------------------------------------------------------
INSERT INTO persona
(nombre   , apellido , edad, tipo      , nombre_pueblo, poblacion) VALUES
('carlos' , 'calvo'  , 22  , 'GUERRERO', 'lomas'      , 1000     ),
('juan'   , 'garcia' , 25  , 'GUERRERO', 'lomas'      , 1000     ),
('julieta', 'granola', 20  , 'ALDEANO' , 'lomas'      , 1000     );

-- -----------------------------------------------------------------------------
-- guerrero
-- -----------------------------------------------------------------------------
INSERT INTO guerrero
(id  , habilidad       , rango) VALUES
(1   , 'cortar cabezas', 1    ),
(2   , 'cortar brazos' , 2    );

-- -----------------------------------------------------------------------------
-- aldeano
-- -----------------------------------------------------------------------------
INSERT INTO aldeano
(id  , cultivo  ) VALUES
(3   , 'tomates');

