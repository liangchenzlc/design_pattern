package com.coderedma.pattern.composite;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author coderedma
 * @Desc 员工类
 * @createTime 2024/7/25 16:50
 * @since 1.0.0
 */
public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;

    // 姓名
    private String name;
    // 部门
    private String dept;
    // 薪水
    private int salary;
    // 员工
    private List<Employee> subordinates = new ArrayList<>();

    public Employee(String name, String dept, int salary)
    {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public void add(Employee e)
    {
        subordinates.add(e);
    }

    public void remove(Employee e)
    {
        subordinates.remove(e);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                ", subordinates=" + subordinates +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(List<Employee> subordinates) {
        this.subordinates = subordinates;
    }
}
