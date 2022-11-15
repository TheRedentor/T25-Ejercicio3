
DROP table IF EXISTS almacenes;
DROP table IF EXISTS cajas;

create table almacenes(
	codigo_almacen int auto_increment primary key,
	lugar varchar(100),
	capacidad int
);

create table cajas(
	num_referencia varchar(5) primary key,
	contenido varchar(100),
	valor int,
	codigo_almacen int,
	foreign key (codigo_almacen) references almacenes(codigo_almacen) on delete cascade on update cascade
);

insert into almacenes (lugar, capacidad) values ('Lugar 1', 10000);
insert into almacenes (lugar, capacidad) values ('Lugar 2', 20000);
insert into almacenes (lugar, capacidad) values ('Lugar 3', 30000);
insert into almacenes (lugar, capacidad) values ('Lugar 4', 40000);
insert into almacenes (lugar, capacidad) values ('Lugar 5', 50000);

insert into cajas (num_referencia, contenido, valor, codigo_almacen) values ('11111', 'Contenido 1', 10, 1);
insert into cajas (num_referencia, contenido, valor, codigo_almacen) values ('22222', 'Contenido 2', 20, 2);
insert into cajas (num_referencia, contenido, valor, codigo_almacen) values ('33333', 'Contenido 3', 30, 3);
insert into cajas (num_referencia, contenido, valor, codigo_almacen) values ('44444', 'Contenido 4', 40, 4);
insert into cajas (num_referencia, contenido, valor, codigo_almacen) values ('55555', 'Contenido 5', 50, 5);
