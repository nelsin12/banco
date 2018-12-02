
CREATE TABLE `sucursal` (
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	nombre VARCHAR(75) NOT NULL,
	direccion VARCHAR(100) NOT NULL
);

INSERT INTO `sucursal` (nombre,direccion) VALUES
('sucursal_1','direccion_1'),
('sucursal_2','direccion_2');

CREATE TABLE `perfil` (
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	nombre VARCHAR(75) NOT NULL
);

INSERT INTO `perfil` (nombre) VALUES
('administrador'),
('ejecutivo'),
('cliente');

CREATE TABLE `usuario` (
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	nombre VARCHAR(100) NOT NULL,		
	alias VARCHAR(10) NOT NULL,
	clave VARCHAR(12) NOT NULL,
	rut VARCHAR(11) NOT NULL,
	id_perfil INT NOT NULL,
	id_sucursal INT NOT NULL,
	UNIQUE (rut,id_perfil),
	FOREIGN KEY (id_perfil) REFERENCES perfil(id)
);

INSERT INTO `usuario` (nombre,alias,clave,rut,id_perfil,id_sucursal) VALUES
('Administrador_1','admin','admin','1-9',1,1),
('Ejecutivo_1','ej_1','ej_1','2-9',2,1),
('Ejecutivo_2','ej_2','ej_2','3-9',2,2),
('Cliente_1','cl_1','cl_1','4-9',3,1),
('Cliente_2','cl_2','cl_2','5-9',3,2);

CREATE TABLE `cliente` (
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	id_usuario INT,
	fono INT NOT NULL,
	sueldo	INT NOT NULL,
	direccion_particular VARCHAR(100) NOT NULL,
	direccion_laboral VARCHAR(100) NOT NULL,
	creado_el DATE NOT NULL,
	FOREIGN KEY (id_usuario) REFERENCES usuario(id)
);

INSERT INTO `cliente` (id_usuario,fono,sueldo,direccion_particular,direccion_laboral,creado_el) VALUES
(4,1111111,500000,'dp_1','dl_1','2018-01-01'),
(5,2222222,750000,'dp_2','dl_2','2018-11-01');

CREATE TABLE `credito` (
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	folio VARCHAR(10) NOT NULL,
	monto INT NOT NULL,
	num_cuotas INT NOT NULL,
	estado TINYINT(1) NOT NULL,
	creado_el DATE NOT NULL,
	aprobado_el DATE,
	entregado_el DATE,
	creado_por INT NOT NULL,
	id_cliente INT NOT NULL,
	UNIQUE (folio),
	FOREIGN KEY (creado_por) REFERENCES usuario(id),
	FOREIGN KEY (id_cliente) REFERENCES cliente(id)
);

INSERT INTO `credito` (folio,monto,num_cuotas,estado,creado_el,creado_por,id_cliente) VALUES
('IAK9S5FLM6',1000000,6,0,CURDATE(),2,4);

CREATE TABLE `config` (
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	llave VARCHAR(50) NOT NULL,
	valor VARCHAR(50) NOT NULL
);

INSERT INTO `config` (llave,valor) VALUES
('tope_credito',20000000),
('min_credito',300000),
('num_min_cuotas',6),
('num_max_cuotas',48),
('min_antiguedad',6),
('factor_max_credito',1.5);