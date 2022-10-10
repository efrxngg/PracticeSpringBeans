package edu.spring.db.entity;

import org.springframework.beans.factory.annotation.Autowired;

public class Invoice3 {
    @Autowired //Inyeccion de dependencias mediante campo
    private Vendor vendor;

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }
    
}
