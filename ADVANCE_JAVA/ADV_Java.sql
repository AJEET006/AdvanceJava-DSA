/*
 drop procedure if exists getN;
 delimiter $$
 
 create procedure getN(in u_id int ,in u_price int,out u_name varchar(20))
 begin
    select name into u_name from product where u_id = id and u_price = price;
end $$

delimiter ;
*/
drop procedure if exists getInfo;
 delimiter $$
 
 create procedure getInfo(in u_id int ,out i_id int,out u_name varchar(20),out u_price int)
 begin
	set @i_id=0;
	set @u_name=null;
	set @u_price=0;
   	select id into i_id from product where id=u_id;
	select name into u_name from product where id=u_id;
	select price into u_price from product where id=u_id;
	
end $$

delimiter ;










































































