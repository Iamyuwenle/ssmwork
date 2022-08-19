package com.le.controller;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.le.entity.Bills;
import com.le.entity.ResultVO;
import com.le.service.BillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BillsController {

    @Autowired
    private BillsService billsService;

    /*@RequestMapping("/billsAll")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    public List<Bills> getAllBills(@RequestBody(required=true) Bills bills) {

        List<Bills> allBills = billsService.getAllBills();
        System.out.println(allBills);
        return allBills;
    }*/

    @RequestMapping("/billsAll")
    public List<Bills> getAllBills() {

        List<Bills> allBills = billsService.getAllBills();
        System.out.println(allBills);
        return allBills;
    }
}
