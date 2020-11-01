drop schema if exists lab8;
create schema lab8 character set utf8 collate utf8_general_ci;
use lab8;

create table car (
id Int auto_increment,
brand varchar(255) not null,
types varchar(255) not null,
color varchar(255) not null,
capacity float not null,
price varchar(255) not null,
primary key (id));
