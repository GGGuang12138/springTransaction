create schema transaction;
create table user
(
	userId int auto_increment,
	name varchar(10) not null,
	constraint user_pk
		primary key (userId)
);
create table account
(
	accountId int auto_increment,
	accountName varchar(50) not null,
	user varchar(50) not null,
	constraint account_pk
		primary key (accountId)
);