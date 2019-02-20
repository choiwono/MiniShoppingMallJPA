insert into account (id,email,name,nick_name,passwd,reg_date)
values(1,'treasureb1220@gmail.com','최원오','choiwono1','{bcrypt}$2a$10$o3eFgx5gkg0UPctYnvje7OMSTKhfZJ9H2.X/60UKxH382LeCIcHJ.',NOW());

insert into account (id,email,name,nick_name,passwd,reg_date)
values(2,'treasureb1330@gmail.com','최원오','choiwono2','{bcrypt}$2a$10$o3eFgx5gkg0UPctYnvje7OMSTKhfZJ9H2.X/60UKxH382LeCIcHJ.',NOW());

insert into account (id,email,name,nick_name,passwd,reg_date)
values(3,'admin','최원오','choiwono2','{bcrypt}$2a$10$o3eFgx5gkg0UPctYnvje7OMSTKhfZJ9H2.X/60UKxH382LeCIcHJ.',NOW());


insert into roles (id,name,reg_date)
values(1,'ADMIN',NOW());

insert into roles (id,name,reg_date)
values(2,'USER',NOW());

insert into account_roles (account_id,role_id)
values(1,2);

insert into account_roles (account_id,role_id)
values(2,2);

insert into account_roles (account_id,role_id)
values(3,1);

insert into product_category (id,category_name,reg_date,ordering)
values(1,'귀여운',NOW(),1);
insert into product_category (id,category_name,reg_date,ordering)
values(2,'재밌는',NOW(),2);
insert into product_category (id,category_name,reg_date,ordering)
values(3,'메시지',NOW(),3);
insert into product_category (id,category_name,reg_date,ordering)
values(4,'일러스트',NOW(),4);
insert into product_category (id,category_name,reg_date,ordering)
values(5,'카카오공식',NOW(),5);
insert into product_category (id,category_name,reg_date,ordering)
values(6,'동물',NOW(),6);
insert into product_category (id,category_name,reg_date,ordering)
values(7,'주제',NOW(),7);
insert into product_category (id,category_name,reg_date,ordering)
values(8,'스타/방송',NOW(),8);
insert into product_category (id,category_name,reg_date,ordering)
values(9,'만화/웹툰',NOW(),9);

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

insert into review (id,content,rating,reg_date,title,product_id,account_id)
values(1,'별로네요 칫',4.5,NOW(),'정말 좋아요 ^^',1,1);
insert into review (id,content,rating,reg_date,title,product_id,account_id)
values(3,'별로네요 칫칫',4.0,NOW(),'정말 좋아요 ^^',1,1);
insert into review (id,content,rating,reg_date,title,product_id,account_id)
values(2,'별로네요 칫칫칫',5.0,NOW(),'정말 좋아요 ^^!!!',1,2);
