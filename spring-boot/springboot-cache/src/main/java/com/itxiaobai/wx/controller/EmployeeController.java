package com.itxiaobai.wx.controller;


import com.itxiaobai.wx.bean.Employee;
import com.itxiaobai.wx.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/getById/{id}")
    public Employee getEmployeeById(@PathVariable("id") Integer id){
        return employeeService.getEmployee(id);
    }


    @GetMapping("/update")
    public Employee update(Employee employee){
        Employee emp = employeeService.updateEmp(employee);
        return emp;
    }

    @GetMapping("/delete")
    public String deleteEmp(Integer id){
        employeeService.deleteEmp(id);
        return "success";
    }
}

