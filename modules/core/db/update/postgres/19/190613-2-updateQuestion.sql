-- alter table COURSES_QUESTION add column TEST_ID bigint ^
-- update COURSES_QUESTION set TEST_ID = <default_value> ;
-- alter table COURSES_QUESTION alter column TEST_ID set not null ;
alter table COURSES_QUESTION add column TEST_ID bigint not null ;
