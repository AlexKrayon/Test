create table Developers(
                           Id_Number INTEGER primary key,
                           Names varchar(30),
                           Salary INTEGER
);

create table Testers(
                        Id_Number INTEGER primary key,
                        Names varchar(30),
                        Salary INTEGER
);


insert into DEVELOPERS values (1,'Myke', 120000);
insert into DEVELOPERS values (2,'John', 122000);
insert into DEVELOPERS values (3,'Ali', 115000);
insert into DEVELOPERS values (4,'Olga', 110000);
insert into TESTERS values (1,'Adam', 90000);
insert into TESTERS values (2,'Molly', 130000);
insert into TESTERS values (3,'Carry', 95000);

commit work;

select * from DEVELOPERS;

select * from TESTERS;

