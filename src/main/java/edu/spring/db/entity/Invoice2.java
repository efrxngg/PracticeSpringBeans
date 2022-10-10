package edu.spring.db.entity;

import org.springframework.beans.factory.annotation.Autowired;

public class Invoice2 {
    private Vendor vendor;

    @Autowired // Inyeccion de dependencias mediante constructor
    public Invoice2(Vendor vendor) {
        this.vendor = vendor;
    }

    public Vendor getVendor() {
        return vendor;
    }
}
