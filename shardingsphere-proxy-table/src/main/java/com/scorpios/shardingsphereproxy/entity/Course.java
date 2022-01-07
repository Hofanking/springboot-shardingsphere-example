package com.scorpios.shardingsphereproxy.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;


@ToString
@Data
@TableName("t_course")
public class Course implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long cid;
    private String cname;
    private Long userId;
    private String cstatus;
}
