DROP TABLE IF EXISTS guerrero;

DROP TABLE IF EXISTS aldeano;

DROP TABLE IF EXISTS persona;

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
