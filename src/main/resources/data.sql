insert into account (id,email,name,passwd,reg_date)
values(1,'treasureb1220@gmail.com','choiwono1','1233',NOW());

insert into account (id,email,name,passwd,reg_date)
values(2,'treasureb1330@gmail.com','choiwono2','1235',NOW());

insert into roles (id,name,reg_date)
values(1,'관리자',NOW());

insert into roles (id,name,reg_date)
values(2,'일반회원',NOW());

insert into account_roles (account_id,role_id)
values(1,2);

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

insert into review (id,content,rating,reg_date,title,product_id,account_id)
values(1,'별로네요 칫',4.5,NOW(),'정말 좋아요 ^^',1,1);
insert into review (id,content,rating,reg_date,title,product_id,account_id)
values(3,'별로네요 칫칫',4.0,NOW(),'정말 좋아요 ^^',1,1);
insert into review (id,content,rating,reg_date,title,product_id,account_id)
values(2,'별로네요 칫칫칫',5.0,NOW(),'정말 좋아요 ^^!!!',1,2);

insert into orders (id,addr1,addr2,email1,email2,message,order_no,order_status,
                    payment,phone1,phone2,receiver_name,receiver_phone1,
                    receiver_phone2,reg_date,total_price,user_auth,user_name,zip_code)
values(1,'주소1','주소2','treasure_b','naver.com','빨리보내주세용','S2019020917889','1',1,
       '6292','3620','이름테스트','6293','3620',NOW(),6900,1,'최원오',01752);

insert into orders (id,addr1,addr2,email1,email2,message,order_no,order_status,
                    payment,phone1,phone2,receiver_name,receiver_phone1,
                    receiver_phone2,reg_date,total_price,user_auth,user_name,zip_code)
values(2,'주소1','주소2','treasure_b','naver.com','빨리보내주세용','S2019020917889','1',1,
       '6292','3620','이름테스트','6293','3620',NOW(),9200,1,'최원오',01752);


insert into order_product (id,amount,name,reg_date,total_price,product_id,order_id)
values(1,3,'재밌는이모티콘',NOW(),6900,6,1);

insert into order_product (id,amount,name,reg_date,total_price,product_id,order_id)
values(2,1,'재밌는이모티콘2',NOW(),2300,7,2);

insert into order_product (id,amount,name,reg_date,total_price,product_id,order_id)
values(3,1,'재밌는이모티콘2',NOW(),2300,7,2);
