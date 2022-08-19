package com.le.service;

import com.le.entity.Bills;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BillsService{


    int deleteByPrimaryKey(Integer id);

    int insert(Bills record);

    int insertSelective(Bills record);

    Bills selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Bills record);

    int updateByPrimaryKey(Bills record);

    List<Bills> getAllBills();
}
