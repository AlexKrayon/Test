select  * from SCRUMTEAM;

ALTER TABLE SCRUMTEAM ADD salary INTEGER;

UPDATE scrumteam Set salary = 100000
where EMPID=1;
UPDATE scrumteam Set salary = 120000
where EMPID=2;
UPDATE scrumteam Set salary = 90000
where EMPID=3;

