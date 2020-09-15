package com.itxiaobai.wx;

import com.itxiaobai.wx.bean.Employee;
import com.itxiaobai.wx.mapper.EmployeeMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootCacheApplicationTests {
    @Autowired
    private EmployeeMapper employeeMapper;

    @Test
    void contextLoads() {
        Employee employeeById = employeeMapper.getEmployeeById(1);
        System.out.println(employeeById.toString());
    }

}
