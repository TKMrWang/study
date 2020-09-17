package com.itxiaobai.wx.service;

import com.itxiaobai.wx.bean.Employee;
import com.itxiaobai.wx.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    /**
     * 方法运行结果进行缓存
     * 几个属性：
     * cacheNames/value:指定缓组件的名字
     * key:缓存数据使用的key，默认使用方法参数的值
     * keyGenerator:key的生成器，可以自己指定key的生成器的组件id
     * key/keyGenerator:二选一使用
     * cacheManager:指定缓存管理器；或者cacheResolve一定获取解析器，二者二选一
     * condition:指定符合条件的情况下才进行缓存
     * unless:否定缓存，当unless指定的条件为true,方法的返回值不会进行缓存；可以获取到结果进行判断
     * sync:缓存是否使用异步模式
     *
     * @param id
     * @return
     */
    @Cacheable(cacheNames = "emp")
    public Employee getEmployee(Integer id) {
        System.out.println("查询" + id + "号员工");
        Employee employee = employeeMapper.getEmployeeById(id);
        return employee;
    }

    /**
     * cacheput :既调用方法，又更新缓存数据
     * 运行顺序：
     *      先调用方法，再更新缓存数据
     * 需要指定要更新的缓存的key，否则将不会更新缓存中的数据
     *  key可以有两种方式：1.key="#employee.id"
     *                  2.key="#result.id"
     * @param employee
     * @return
     */
    @CachePut(cacheNames = "emp",key = "#employee.id")
    public Employee updateEmp(Employee employee) {
        System.out.println("update emp:" +employee);
        employeeMapper.updateEmployee(employee);
        return employee;
    }

    /**
     * 缓存数据
     * key:指定要清除的缓存
     * allEntries = true:清除缓存中的所有数据
     * beforeInvocation:缓存的执行是否在方法执行之前执行。默认为false,在方法之后执行
     * @param id
     */
    @CacheEvict(value = "emp",key = "#id")
    public void deleteEmp(Integer id){
        System.out.println("删除："+id+"号id");

    }
}
