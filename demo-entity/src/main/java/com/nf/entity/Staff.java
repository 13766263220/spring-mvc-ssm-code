package com.nf.entity;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class Staff {
    private Integer id;
    private String name;
    private String sex;
    private BigDecimal wages;
    private Department department;
}
