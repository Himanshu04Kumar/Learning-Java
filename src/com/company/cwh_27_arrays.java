package com.company;

public class cwh_27_arrays {
    public static void main(String[] args) {

        /*
        int[]marks = {45,55,95,424,346,};
        float[]marks = {45.5f,55.5454f,95.4f,424.7f,346,};
        System.out.println(marks.length);
        System.out.println(marks[2]);
         */


/*
        String[] name = {"Himanshu", "Ecliptic", "sam", "ram"};
        System.out.println(name.length);
        System.out.println(name[0]);
        System.out.println(name[1].toUpperCase());
 */

        int[]marks = {45,55,95,424,346,};
//        System.out.println(marks.length);

//        Displaying the array (Naive way)
        System.out.println("Printing Using Naive way");

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        //        Displaying the array (FOR LOOP)
        System.out.println("Printing Using FOR LOOP");
        for (int i=0; i<marks.length ; i++) {
            System.out.println(marks[i]);
        }

//        Displaying arrays in reverse order
        System.out.println("Displaying the arrays in reverse order");
        for (int i = marks.length-1; i>=0 ; i--){
            System.out.println(marks[i]);
        }



//      Quick quiz: Displaying the array (for - each loop)
        System.out.println("Printing using for-each loop");
        for (int elements: marks){
            System.out.println(elements);
        }


    }
}
