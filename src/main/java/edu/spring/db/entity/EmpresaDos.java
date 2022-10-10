package edu.spring.db.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class EmpresaDos {

    @Value("${nombre.empresa}")
    private String name;

    @Autowired
    private Address address;

}
