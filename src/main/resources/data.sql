insert into account (id,address,email,name,passwd,phone,reg_date)
values(1,'서울시노원구상계동','treasureb1220@gmail.com','choiwono1','1233','01062923620',NOW());

insert into account (id,address,email,name,passwd,phone,reg_date)
values(2,'서울시노원구상계동','treasureb1330@gmail.com','choiwono2','1235','01062923620',NOW());

insert into account (id,address,email,name,passwd,phone,reg_date)
values(3,'비회원','be@gmail.com','guest','1234','01062923620',NOW());

insert into roles (id,name,reg_date)
values(1,'관리자',NOW());

insert into roles (id,name,reg_date)
values(2,'일반회원',NOW());

insert into roles (id,name,reg_date)
values(3,'비회원',NOW());

insert into account_roles (account_id,role_id)
values(1,2);

insert into account_roles (account_id,role_id)
values(2,2);

insert into account_roles (account_id,role_id)
values(3,3);

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

insert into review (id,content,rating,reg_date,title,product_id,account_id)
values(1,'별로네요 칫',4.5,NOW(),'정말 좋아요 ^^',1,1);
insert into review (id,content,rating,reg_date,title,product_id,account_id)
values(3,'별로네요 칫칫',4.0,NOW(),'정말 좋아요 ^^',1,1);
insert into review (id,content,rating,reg_date,title,product_id,account_id)
values(2,'별로네요 칫칫칫',5.0,NOW(),'정말 좋아요 ^^!!!',1,2);

insert into orders (id,order_no,reg_date,status,total_price)
values(1,'S201902081033',NOW(),'N',6900);

insert into orders (id,order_no,reg_date,status,total_price)
values(2,'S201902081034',NOW(),'N',4600);

insert into orders (id,order_no,reg_date,status,total_price)
values(3,'S201902081037',NOW(),'N',9200);

insert into order_product (id,amount,name,reg_date,total_price,product_id,order_id,account_id)
values(1,3,'재밌는이모티콘',NOW(),6900,6,1,1);

insert into order_product (id,amount,name,reg_date,total_price,product_id,order_id,account_id)
values(2,1,'재밌는이모티콘2',NOW(),2300,7,2,2);

insert into order_product (id,amount,name,reg_date,total_price,product_id,order_id,account_id)
values(3,1,'재밌는이모티콘2',NOW(),2300,7,2,2);

insert into order_product (id,amount,name,reg_date,total_price,product_id,order_id,account_id)
values(4,2,'재밌는이모티콘2',NOW(),2300,7,3,3);

insert into order_product (id,amount,name,reg_date,total_price,product_id,order_id,account_id)
values(5,2,'재밌는이모티콘2',NOW(),2300,7,3,3);
