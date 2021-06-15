package com.company;

class Employee {
    int id;
    String name;
    int salary;

    public void printDetail() {
        System.out.println("My id is " + id);
        System.out.println("and my name is " + name);
    }

    public int getSalary() {
        return salary;

    }
}
public class cwh_38_custom_class {
    public static void main(String[] args) {
        System.out.println("This is a custom class");
        Employee himanshu = new Employee();        // Instantiating a new Employee Object
        Employee john = new Employee();        // Instantiating a new Employee Object


//        Setting Attributes for Himanshu
        himanshu.id = 12;
        himanshu.salary = 99;
        himanshu.name = "Himanshu Kumar";

//        Setting attributes for John
        john.id = 20;
        john.salary = 10;
        john.name = "John Wick";

//        Printing the Attributes
        himanshu.printDetail();
        john.printDetail();
        int salary = john.getSalary();
        System.out.println(salary);
//        System.out.println(himanshu.id);
//        System.out.println(himanshu.name);
    }
}
