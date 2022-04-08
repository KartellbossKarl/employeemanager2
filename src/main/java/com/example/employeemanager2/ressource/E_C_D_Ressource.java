package com.example.employeemanager2.ressource;

import com.example.employeemanager2.model.Employee_Company_Department;
import com.example.employeemanager2.service.E_C_DService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees1")
public class E_C_D_Ressource {
    private final E_C_DService ecdService;

        public E_C_D_Ressource( E_C_DService ecdService) {
            this.ecdService = ecdService;
        }

        @GetMapping("/all")
        public ResponseEntity<List<Employee_Company_Department>> getAllEmployees () {
            List<Employee_Company_Department> employees_department = ecdService.findAllEmployees_C_D();
            return new ResponseEntity<>(employees_department, HttpStatus.OK);
        }

    }
