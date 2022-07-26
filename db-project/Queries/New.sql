
create table SCRUMTEAM (
    EmpID INTEGER PRIMARY KEY,
    FirstName varchar(30) not null,
    LastName varchar(30),
    JobTitle varchar(20)

);

select * from SCRUMTEAM;

INSERT INTO SCRUMTEAM (EmpID, FirstName, LastName, JobTitle)
VALUES (1,'Veli','Aktar','QA');

INSERT INTO SCRUMTEAM VALUES (2,'Ahmet','Donmez','Java');
INSERT INTO SCRUMTEAM VALUES (3,'Alper', 'Kasap', 'SDET');


INSERT INTO SCRUMTEAM VALUES (3,'Alp','Taskın','SQL');
INSERT INTO SCRUMTEAM VALUES (4,'Olgun','Yasar','Developer');
INSERT INTO SCRUMTEAM VALUES (5,'Varol','Mesut','SDET');

UPDATE SCRUMTEAM
SET JOBTITLE = 'Tester'
WHERE EMPID = 2;

DELETE from SCRUMTEAM
where EMPID = 3;

commit;

