DROP TABLE IF EXISTS users;

create table users (
id int primary key auto_increment,
firstName varchar(30),
lastName varchar(30),
email varchar(30),
pass varchar(200),
token varchar(200)
);