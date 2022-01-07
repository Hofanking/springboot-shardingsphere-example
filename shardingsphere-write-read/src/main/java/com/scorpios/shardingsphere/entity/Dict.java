package com.scorpios.shardingsphere.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "t_dict")
public class Dict {
    private Long dictId;
    private String ustatus;
    private String uvalue;
}
