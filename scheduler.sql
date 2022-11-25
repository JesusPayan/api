use scheduler;
-- drop table person;
create table person(
id int not null auto_increment primary key,
name varchar(45)not null,
last_name varchar(45)not null,
celphone int not null,
email varchar(100) unique
);
select * from person;
insert into person (id,name ,last_name,celphone,email )values("Goku","Sayayin",6666666,"goku_sayain@gmail.com");
insert into person (id,name ,last_name,celphone,email )values("Gohan","Sayayin",555555,"gohan_sayain@gmail.com");
insert into person (id,name ,last_name,celphone,email )values("Bardock","Sayayin",77777,"Bardock@gmail.com");
commit;