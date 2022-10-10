package edu.spring.db.entity;

public class Address {
    private String street;
    private int number;

    public Address(){}
    public Address(String street, int number) {
        this.street = street;
        this.number = number;
    }

    //#region Setter and Getters
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    //#endregion   
    @Override
    public String toString() {
        return "Address [street=" + street + ", number=" + number + "]";
    }
   
}
