package com.workintech.employeeApp.model;

import java.util.Arrays;

public class Employee {
    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthplans;

    public Employee(int id, String fullName, String email, String password, String[] healthplans){
        this.id = id;
        this.fullName= fullName;
        this.email= email;
        this.password= password;
        this.healthplans= healthplans;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String[] getHealthplans() {
        return healthplans;
    }

    public void ddHealthplan(int index, String name){
        try {
            if (healthplans[index] == null) {
                healthplans[index] = name;
            } else {
                System.out.println("indeks ataması zaten yapılmış");
            }
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("indexs ataması yapıldı");
        }
    }

    @Override
    public String toString() {
       return "Fullname: " + fullName + " Healthplans: " + Arrays.toString(healthplans);
    }
}
