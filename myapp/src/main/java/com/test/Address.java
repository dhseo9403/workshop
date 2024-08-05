package com.test;

import org.springframework.stereotype.Component;

@Component
public class Address {
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    
}
