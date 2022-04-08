package com.example.employeemanager2.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="department")
public class Department implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="d_id")
    private Long department_id;
    @Column(name="Name")
    private String department_name;
    @Column(name="Income")
    private String income;

    @OneToMany(
            mappedBy = "department",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )

    private List<Employee_Company_Department> employees = new ArrayList<>();


    public Department(String department_name, String income) {
        this.department_name = department_name;
        this.income = income;
    }

    public Department() {

    }

    public Long getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(Long department_id) {
        this.department_id = department_id;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    @Override
    public String toString() {
        return "department{" +
                "department_id=" + department_id +
                ", department_name='" + department_name + '\'' +
                ", income='" + income + '\'' +
                '}';
    }
}
