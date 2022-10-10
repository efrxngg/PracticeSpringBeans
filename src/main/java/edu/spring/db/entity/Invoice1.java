package edu.spring.db.entity;

import org.springframework.beans.factory.annotation.Autowired;

public class Invoice1 {
    private Vendor vendor;

    @Autowired // Inyeccion de dependencias basada en setter
    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public Vendor getVendor() {
        return vendor;
    }
}
