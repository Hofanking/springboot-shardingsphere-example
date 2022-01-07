drop table if EXISTS t_dict;
create table t_dict(
   dict_id BIGINT(20) PRIMARY KEY,
   uvalue VARCHAR(20) NOT NULL,
   ustatus VARCHAR(10) NOT NULL
)