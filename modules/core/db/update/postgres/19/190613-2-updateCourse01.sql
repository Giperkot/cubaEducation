alter table COURSES_COURSE add constraint FK_COURSES_COURSE_ON_SPECIALIZATION foreign key (SPECIALIZATION_ID) references COURSES_SPECIALIZATION(ID);
create index IDX_COURSES_COURSE_ON_SPECIALIZATION on COURSES_COURSE (SPECIALIZATION_ID);
