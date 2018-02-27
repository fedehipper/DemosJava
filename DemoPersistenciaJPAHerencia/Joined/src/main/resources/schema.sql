DROP TABLE guerrero IF EXISTS;

DROP TABLE aldeano IF EXISTS;

DROP TABLE persona IF EXISTS;

CREATE TABLE persona (
    id bigint primary key,
    nombre varchar (20),
    apellido varchar (20),
    edad int
);

CREATE TABLE guerrero (
    id bigint primary key,
    habilidad varchar (20),
    rango int
);

CREATE TABLE aldeano (
    id bigint primary key,
    cultivo varchar (20)
);

-- -----------------------------------------------------------------------------
-- persona
-- -----------------------------------------------------------------------------
INSERT INTO persona
(id  , nombre   , apellido , edad) VALUES
(1   , 'carlos' , 'calvo'  , 22  ),
(2   , 'juan'   , 'garcia' , 25  ),
(3   , 'julieta', 'granola', 20  );

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

