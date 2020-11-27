drop schema if exists labMel;
create schema labMel character set utf8 collate utf8_general_ci;
use labMel;

create table Smartphones
(
id int auto_increment,
Name_Generator varchar(80) not null,
Name_Model varchar(80) not null,
Diagonal float not null,
Price int not null,
primary key (id));
