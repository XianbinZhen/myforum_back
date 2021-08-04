drop table if exists user;
create table user (
    userId int auto_increment primary key,
    username varchar(50),
    password varchar(50),
    profileImg varchar(100),
    createdAt int
);