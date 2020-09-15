package com.itxiaobai.wx.service;

import com.itxiaobai.wx.bean.Employee;
import com.itxiaobai.wx.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    /**
     * 方法运行结果进行缓存
     * 几个属性：
     *  cacheNames/value:指定缓组件的名字
     *  key:缓存数据使用的key，默认使用方法参数的值
     *  keyGenerator:key的生成器，可以自己指定key的生成器的组件id
     *      key/keyGenerator:二选一使用
     *  cacheManager:指定缓存管理器；或者cacheResolve一定获取解析器，二者二选一
     *  condition:指定符合条件的情况下才进行缓存
     *  unless:否定缓存，当unless指定的条件为true,方法的返回值不会进行缓存；可以获取到结果进行判断
     *  sync:缓存是否使用异步模式
     * @param id
     * @return
     */
    @Cacheable(cacheNames ="emp")
    public Employee getEmployee(Integer id){
        System.out.println("查询"+id+"号员工");
        Employee employee = employeeMapper.getEmployeeById(id);
        return employee;
    }
}
