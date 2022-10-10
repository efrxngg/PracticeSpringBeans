package edu.spring.db.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class ListCollectionBean {
    
    @Autowired
    private List<String> listOfProgramingLenguages;

    public void printList(){
        listOfProgramingLenguages.forEach(System.out::println);
    }
}
