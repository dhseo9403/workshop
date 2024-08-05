package com.test.myapp2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @Autowired
    Address address;

    @Autowired
    Employee employee;

    @GetMapping("/msg")
    public String getMyService(){
        address.setLocation("서울");
        employee.setName("dhseo");
        return employee.getAddress().getLocation();
    }
}
