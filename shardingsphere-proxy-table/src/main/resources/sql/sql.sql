create table t_course(
   cid BIGINT(20) PRIMARY KEY,
   cname VARCHAR(50) NOT NULL,
   user_id BIGINT(20) NOT NULL,
   cstatus VARCHAR(10) NOT NULL
)