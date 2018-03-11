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

