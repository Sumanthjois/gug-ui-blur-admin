create table BlurAdminUsers (id int auto_increment primary key, username varchar(300), 

email varchar(300), password varchar(300), role varchar(50), enabled TINYINT not null 

DEFAULT 1);
select * from BlurAdminUsers;
