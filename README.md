### Spring+Mybatis 实现简单的声明式事务
### 数据库
```sql
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
```
### 业务逻辑
| 表 |   业务类   | 业务方法 |              功能描述  |
| :----------: | :--------------: |  :--------------: |---------------------------------------------------- |
|user|UserService|createUser|创建账户，并添加账号|
|account|AccountService|addAccount|添加账号|

### 测试
| 场景 |                  createUser                   | addAccount(Exception) | 结果                  |
| ---- | :-------------------------------------------: | --------------------- | --------------------- |
| 1    |                    无事务                     | required              | user成功，account失败 |
| 2    |                   required                    | 无事务                | user失败，account失败 |
| 3    |                   required                    | not_supported         | user失败，account成功 |
| 4    |                   required                    | required_new          | user失败，account失败 |
| 5    |         required(异常移至create末尾)          | required_new          | user失败，account成功 |
| 6    | required(异常移至create末尾)，add方法至当前类 | required_new          | user失败，account失败 |