insert into usuarios (username,password,enabled,nombre,apellido,email) values('michel','1',true,'Michel','Antequera','m.a@gmail.com');
insert into usuarios (username,password,enabled,nombre,apellido,email) values('pedro','1',true,'Pedro','Capo','d.c@gmail.com');
insert into usuarios (username,password,enabled,nombre,apellido,email) values('jose','1',true,'José','Arma','f.g@gmail.com');


INSERT INTO roles (nombre) VALUES('ROLE_ADMIN');
INSERT INTO roles (nombre) VALUES('ROLE_USER');

INSERT INTO usuarios_to_roles(id_user,role_id) VALUES(1,1);
INSERT INTO usuarios_to_roles(id_user,role_id) VALUES(1,2);
INSERT INTO usuarios_to_roles(id_user,role_id) VALUES(2,2);
INSERT INTO usuarios_to_roles(id_user,role_id) VALUES(3,2);