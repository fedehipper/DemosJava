DROP TABLE persona IF EXISTS;

CREATE TABLE persona (
    id bigint primary key,
    nombre varchar (20),
    apellido varchar (20),
    edad int,
    tipo varchar (10),
    habilidad varchar (20),
    rango int,
    cultivo varchar (20)
);

-- -----------------------------------------------------------------------------
-- persona
-- -----------------------------------------------------------------------------
INSERT INTO persona
(id  , nombre   , apellido , edad, tipo      , habilidad       , rango, cultivo  ) VALUES
(1   , 'carlos' , 'calvo'  , 22  , 'Guerrero', 'cortar cabezas', 1    , NULL     ),
(2   , 'juan'   , 'garcia' , 25  , 'Guerrero', 'cortar brazos' , 2    , NULL     ),
(3   , 'julieta', 'granola', 20  , 'Aldeano' , NULL            , NULL , 'tomates');

