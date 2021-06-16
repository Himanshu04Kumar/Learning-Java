package com.company;

class myEmployee{
     private int id;
     private String name;

    public void setName(String n){
        name = n;
    }
     public String getName(){
         return name;
     }
    public void setId(int i){
        id = i;
    }
     public int getId(){
         return id;
     }
}
public class cwh_40_ch9 {
    public static void main(String[] args) {

        myEmployee himanshu = new myEmployee();
//        himanshu.id = 45;
//        himanshu.name = "Himanshu Kumar";       --> This will throw an error due to private access modifier


//        GETTER AND SETTER
        himanshu.setName("Himanshu Kumar");
        himanshu.setId(34);
        System.out.println(himanshu.getId());
        System.out.println(himanshu.getName());
    }
}
