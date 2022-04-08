package com.example.employeemanager2.service;

import com.example.employeemanager2.model.Employee;
import com.example.employeemanager2.model.Employee_Company_Department;
import com.example.employeemanager2.repo.E_C_D_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class E_C_DService {
    private final E_C_D_Repo ecdrepo;

    @Autowired
    public E_C_DService(E_C_D_Repo ecdrepo) {
        this.ecdrepo = ecdrepo;
    }

    public List<Employee_Company_Department> findAllEmployees_C_D() {
        return ecdrepo.findAll();
    }

}
