package com.example.demo.entity.repository;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class PhoneCode implements Serializable {
    private Long id;

    private String telephone;

    private String code;

    private Date createTime;

    private static final long serialVersionUID = 1L;
}