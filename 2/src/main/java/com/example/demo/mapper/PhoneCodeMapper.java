package com.example.demo.mapper;

import com.example.demo.entity.repository.PhoneCode;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PhoneCodeMapper {

    int deleteByPrimaryKey(Long id);

    int insert(PhoneCode record);

    int insertSelective(PhoneCode record);

    PhoneCode selectByPrimaryKey(Long id);
}