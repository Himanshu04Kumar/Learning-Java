package com.company;

public class cwh_31_methods_overloading {

    static void foo(){
        System.out.println("Good Morning Java!");
    }

    static  void foo(int a){
        System.out.println("Good Morning " + a + " Java!");
    }

    static void foo(int a, int b){
        System.out.println("Good Morning " + a + " Java!");
        System.out.println("Good Morning " + b + " Java!");
    }

    static void change(int a){
        a = 98;
    }

    static void change2(int[]arr){
        arr[0]=69;
    }

    static void telljoke(){
        System.out.println("I invented a word\n" +
                                   "Plagiarism!");
    }

    public static void main(String[] args) {
//        telljoke();


//        Case1. Changing the Integer
//        int x = 45;
//        change(x);
//        System.out.println("The value of x after running change is: "+ x);



//        Case2.  Changing the Array
//        int[] marks = {56,68,87,34,89,90};
//        change2(marks);
//        System.out.println("The value of x after running change is: "+ marks[0]);




        foo();
        foo(3000);
        foo(67,79);
    }
}
