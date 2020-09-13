package com.itxiaobai.wx.springbootmybatis.controller;


import com.itxiaobai.wx.springbootmybatis.bean.Employee;
import com.itxiaobai.wx.springbootmybatis.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeMapper employeeMapper;

    @GetMapping("/getByEmployee/{id}")
    public Employee getEmployee(@PathVariable Integer id){
        return  employeeMapper.getById(id);
    }
}
