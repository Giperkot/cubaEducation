-- begin COURSES_QUESTION
create table COURSES_QUESTION (
    ID bigint,
    UUID uuid,
    --
    TEXT text,
    TEST_ID bigint not null,
    --
    primary key (ID)
)^
-- end COURSES_QUESTION
-- begin COURSES_COURSE
create table COURSES_COURSE (
    ID bigint,
    UUID uuid,
    --
    TITLE varchar(255),
    SPECIALIZATION_ID bigint not null,
    --
    primary key (ID)
)^
-- end COURSES_COURSE
-- begin COURSES_TEST
create table COURSES_TEST (
    ID bigint,
    UUID uuid,
    --
    TITLE varchar(255),
    COURSE_ID bigint not null,
    --
    primary key (ID)
)^
-- end COURSES_TEST
-- begin COURSES_SPECIALIZATION
create table COURSES_SPECIALIZATION (
    ID bigint,
    UUID uuid,
    --
    TITLE varchar(255) not null,
    DESCRIPTION text,
    --
    primary key (ID)
)^
-- end COURSES_SPECIALIZATION
