package com.example.employeemanager2.repo;

import com.example.employeemanager2.model.Employee;
import com.example.employeemanager2.model.Employee_Company_Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface E_C_D_Repo extends JpaRepository<Employee_Company_Department, Long> {


}
