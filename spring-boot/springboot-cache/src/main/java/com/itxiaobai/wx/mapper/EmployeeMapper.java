package com.itxiaobai.wx.mapper;

import com.itxiaobai.wx.bean.Employee;
import org.apache.ibatis.annotations.*;

@Mapper
public interface EmployeeMapper {


    @Select("select  * from employee where id = #{id} ")
    public Employee getEmployeeById(Integer id);

    @Update("update employee set lastName=#{lastName},email=#{email},gender=#{gender} where id=#{id} ")
    void updateEmployee(Employee employee);

    @Delete("delete  from employee where id=#{id}")
    void deleteEmployee(Integer id);

    @Insert("insert into emplouee(lastName,email,gender,d_id) values(#{lastName} ,#{email} ,#{gender} ,#{dId} )")
    void insertEmployee(Employee employee);
}
