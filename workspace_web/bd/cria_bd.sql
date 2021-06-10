create database if not exists projeto;
use projeto;

create table itmn_equipamento(
   id_equip integer not null auto_increment,
   hostname   varchar(50) not null,
   ipaddr     varchar(15) not null,

   constraint pk_equip primary key(id_equip)
);

create table itmn_alarme(
   id_alarme integer not null auto_increment,
   nome      varchar(100) not null,
   descricao varchar(200),

   constraint pk_alarme primary key(id_alarme)
);

create table itmn_evento(
   num_seq integer not null auto_increment,
   data_evt date,
   id_alarme integer not null,
   id_equip  integer not null,
   constraint pk_evento primary key (num_seq),
   constraint fk_alarme foreign key (id_alarme) references itmn_alarme (id_alarme),
   constraint fk_equip foreign key (id_equip) references itmn_equipamento(id_equip)
);