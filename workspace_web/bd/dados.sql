use projeto;

create table itmn_usuario(
id_usuario integer not null auto_increment primary key,
nome_usuario varchar(100) not null,
email_usuario varchar(50) not null unique,
racf_usuario varchar(7) not null unique,
senha_usuario varchar(20) not null,
ramal_usuario varchar(10),
depto_usuario varchar(40),
link_foto varchar(255));

insert into itmn_usuario values
(null, 'Eli Benicio', 'elibenicio@gmail.com', 'benicio', 
   '1234', '9876', 'Treinamentos', 'https://avatars.githubusercontent.com/u/84859767?s=48&v=4');
   
   update itmn_usuario set link_foto = 'https://avatars.githubusercontent.com/u/84859767?v=4' where racf_usuario = 'benicio';



insert into itmn_usuario values
(null, 'Professor Isidro', 'isidro@isidro.com', 'isidro', 
   '1234', '9876', 'Treinamentos', 'https://avatars.githubusercontent.com/u/6184696?v=4');

insert into itmn_usuario values
(null, 'Mega Man', 'mega@man.com', 'megaman',
	'1234', '9866', 'Segurança', 'https://pbs.twimg.com/profile_images/1378037175220981760/NqJolFmD.jpg');