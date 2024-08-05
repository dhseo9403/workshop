package com.test.myapp4.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.myapp4.entity.Employee;

@RestController
public class EmployeeController {
    private ArrayList al;

    public EmployeeController(){
        al = new ArrayList<>();
        Employee emp1 = new Employee();
        emp1.setName("홍길동");
        al.add(emp1);
    }

    @GetMapping("/employees")
    public List<Employee> getEmployeeAll(){
        return al;
    }
}
