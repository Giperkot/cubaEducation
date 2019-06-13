-- alter table COURSES_TEST add column COURSE_ID bigint ^
-- update COURSES_TEST set COURSE_ID = <default_value> ;
-- alter table COURSES_TEST alter column COURSE_ID set not null ;
alter table COURSES_TEST add column COURSE_ID bigint not null ;
