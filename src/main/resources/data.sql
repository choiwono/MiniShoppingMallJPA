insert into account (id,address,email,name,passwd,phone,reg_date)
values(1,'서울시노원구상계동','treasureb1220@gmail.com','choiwono1','1233','01062923620',NOW());

insert into account (id,address,email,name,passwd,phone,reg_date)
values(2,'서울시노원구상계동','treasureb1330@gmail.com','choiwono2','1235','01062923620',NOW());

insert into roles (id,name,reg_date)
values(1,'일반회원',NOW());

insert into roles (id,name,reg_date)
values(2,'일반회원',NOW());

insert into account_roles (account_id,role_id)
values(1,1);

insert into account_roles (account_id,role_id)
values(2,2);

insert into product_category (id,category_name,reg_date)
values(1,'귀여운',NOW());
insert into product_category (id,category_name,reg_date)
values(2,'재밌는',NOW());
insert into product_category (id,category_name,reg_date)
values(3,'메시지',NOW());
insert into product_category (id,category_name,reg_date)
values(4,'일러스트',NOW());
insert into product_category (id,category_name,reg_date)
values(5,'카카오공식',NOW());
insert into product_category (id,category_name,reg_date)
values(6,'동물',NOW());
insert into product_category (id,category_name,reg_date)
values(7,'주제',NOW());
insert into product_category (id,category_name,reg_date)
values(8,'스타/방송',NOW());
insert into product_category (id,category_name,reg_date)
values(9,'만화/웹툰',NOW());

insert into product (id,amount,name,price,rating,reg_date,category_id)
values(1,100,'귀여운이모티콘',2300,0.0,NOW(),1);
insert into product (id,amount,name,price,rating,reg_date,category_id)
values(2,100,'귀여운이모티콘2',2300,0.0,NOW(),1);
insert into product (id,amount,name,price,rating,reg_date,category_id)
values(3,100,'귀여운이모티콘3',2300,0.0,NOW(),1);
insert into product (id,amount,name,price,rating,reg_date,category_id)
values(4,100,'귀여운이모티콘4',2300,0.0,NOW(),1);
insert into product (id,amount,name,price,rating,reg_date,category_id)
values(5,100,'귀여운이모티콘5',2300,0.0,NOW(),1);

insert into product (id,amount,name,price,rating,reg_date,category_id)
values(6,100,'재밌는이모티콘',2300,0.0,NOW(),2);
insert into product (id,amount,name,price,rating,reg_date,category_id)
values(7,100,'재밌는이모티콘2',2300,0.0,NOW(),2);
insert into product (id,amount,name,price,rating,reg_date,category_id)
values(8,100,'재밌는이모티콘3',2300,0.0,NOW(),2);
insert into product (id,amount,name,price,rating,reg_date,category_id)
values(9,100,'재밌는이모티콘4',2300,0.0,NOW(),2);
insert into product (id,amount,name,price,rating,reg_date,category_id)
values(10,100,'재밌는이모티콘5',2300,0.0,NOW(),2);

