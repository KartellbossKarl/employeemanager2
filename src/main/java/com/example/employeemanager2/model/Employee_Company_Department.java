package com.example.employeemanager2.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "employees_table")
@SecondaryTables({
        @SecondaryTable(name="person")
})
public class Employee_Company_Department implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id", nullable = false, updatable = false)
    private Long id;
    @Column(name="name")
    private String employee_name;
    @Column(name="age", table="person")
    private String age;
    @ManyToOne
    @JoinColumn(name="d_id", nullable=false)
    private Department getDepartment_name;

    public Employee_Company_Department(String employee_name, String age, com.example.employeemanager2.model.Department department) {
        this.employee_name = employee_name;
        this.age = age;
        this.getDepartment_name = getDepartment_name;
    }

    public Employee_Company_Department() {

    }

    @Override
    public String toString() {
        return "Employee_Company_Department{" +
                "Employee_id=" + id +
                ", employee_name='" + employee_name + '\'' +
                ", age='" + age + '\'' +
                ", department=" + getDepartment_name.getDepartment_name() +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public com.example.employeemanager2.model.Department getDepartment() {
        return getDepartment_name;
    }

    public void setDepartment(com.example.employeemanager2.model.Department department) {
        this.getDepartment_name = department;
    }
}
