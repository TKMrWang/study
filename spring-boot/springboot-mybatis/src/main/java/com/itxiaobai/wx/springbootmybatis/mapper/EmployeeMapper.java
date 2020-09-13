package com.itxiaobai.wx.springbootmybatis.mapper;

import com.itxiaobai.wx.springbootmybatis.bean.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface EmployeeMapper {

    Employee getById(Integer id);

}
