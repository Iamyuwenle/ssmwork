package com.le.mapper;

import com.le.entity.Bills;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BillsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Bills record);

    int insertSelective(Bills record);

    Bills selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Bills record);

    int updateByPrimaryKey(Bills record);

    List<Bills> getAllBills();
}