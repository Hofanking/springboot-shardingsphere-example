drop table if EXISTS t_course_1;
create table t_course_1(
   cid BIGINT(20) PRIMARY KEY,
   cname VARCHAR(50) NOT NULL,
   user_id BIGINT(20) NOT NULL,
   cstatus VARCHAR(10) NOT NULL
);

drop table if EXISTS t_course_2;
create table t_course_2(
   cid BIGINT(20) PRIMARY KEY,
   cname VARCHAR(50) NOT NULL,
   user_id BIGINT(20) NOT NULL,
   cstatus VARCHAR(10) NOT NULL
);