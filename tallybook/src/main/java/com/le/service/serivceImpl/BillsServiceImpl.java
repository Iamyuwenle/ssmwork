package com.le.service.serivceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.le.mapper.BillsMapper;
import com.le.entity.Bills;
import com.le.service.BillsService;

import java.util.List;

@Service
public class BillsServiceImpl implements BillsService{

    @Autowired
    private BillsMapper billsMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return billsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Bills record) {
        return billsMapper.insert(record);
    }

    @Override
    public int insertSelective(Bills record) {
        return billsMapper.insertSelective(record);
    }

    @Override
    public Bills selectByPrimaryKey(Integer id) {
        return billsMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Bills record) {
        return billsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Bills record) {
        return billsMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Bills> getAllBills() {
        return billsMapper.getAllBills();
    }

}
