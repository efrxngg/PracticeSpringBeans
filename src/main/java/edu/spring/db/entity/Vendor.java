package edu.spring.db.entity;

import org.springframework.stereotype.Component;

@Component
public class Vendor {
    private int code;
    private String name;

    
    public Vendor() {}
    public Vendor(int code, String name) {
        this.code = code;
        this.name = name;
    }
    
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
