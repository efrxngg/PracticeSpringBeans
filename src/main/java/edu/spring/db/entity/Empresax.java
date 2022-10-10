package edu.spring.db.entity;

import org.springframework.beans.factory.annotation.Value;

public class Empresax {
    @Value("${nombre.empresa}")
    private String name;
    private Address address;

    public Empresax() {
    }

    public Empresax(Address address) {
        this.address = address;
    }

    public Empresax(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // #region Setters and Getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    // #endregion

    @Override
    public String toString() {
        return "Empresax [name=" + name + ", address=" + address + "]";
    }

}
