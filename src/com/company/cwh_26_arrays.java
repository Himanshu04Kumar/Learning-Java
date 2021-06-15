package com.company;

public class cwh_26_arrays {
    public static void main(String[] args) {
        /* Classroom of 500 students - You have to store marks of these students
        You have 2 option
        1. Create 500 variables
        2. Use ARRAYS (recommended)
         */

//        THERE ARE THREE WAYS TO USE DECLARE AN ARRAY

//   1.      DECLARATION + MEMORY ALLOCATION
//        int[] marks = new int[5];



//   2.         DECLARATION AND THEN MEMORY ALLOCATION
//        int[]marks;
//        marks = new int[5];
//        marks[0] = 100;
//        marks[1] = 20;
//        marks[2] = 90;
//        marks[3] = 50;
//        marks[4] = 70;
//        marks[5] = 700;                    ------>       will throw an error



//        DECLARATION AND INITIALIZATION
        int[]marks = {45,55,95,424,346,};
        System.out.println(marks[4]);
    }
}
