alter table COURSES_TEST add constraint FK_COURSES_TEST_ON_COURSE foreign key (COURSE_ID) references COURSES_COURSE(ID);
create index IDX_COURSES_TEST_ON_COURSE on COURSES_TEST (COURSE_ID);
