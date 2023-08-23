package com.workintech.employeeApp.enums;

public enum Plan {
     BASIC("BASIIC", 3000),
     NORMAL("NORMAL", 1500),
     ADVANCE("ADVANCE",2400);
     private String name;
     private int price;
     Plan (String name, int price){
         this.name= name;
         this.price= price;
     }
     public String getName(){
         return name;
     }
     public int getPrice(){
         return price;
     }
}
