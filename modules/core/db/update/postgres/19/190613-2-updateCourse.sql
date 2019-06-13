-- alter table COURSES_COURSE add column SPECIALIZATION_ID bigint ^
-- update COURSES_COURSE set SPECIALIZATION_ID = <default_value> ;
-- alter table COURSES_COURSE alter column SPECIALIZATION_ID set not null ;
alter table COURSES_COURSE add column SPECIALIZATION_ID bigint not null ;
