package com.company;
import java.util.Scanner;
public class CBSEmarksCalculator {
    public static void main(String[] args) {

//        Write a program to calculate percentage of a given students in CBSE board exam. His marks from 5 subjects
//        must be taken as input from users

        Scanner sc = new Scanner(System.in);
        System.out.println("**Enter marks out of 100**");

        System.out.println("Enter marks in English");
        float eng = sc.nextFloat();

        System.out.println("Enter marks in Maths");
        float maths = sc.nextFloat();

        System.out.println("Enter marks in Hindi");
        float hindi = sc.nextFloat();

        System.out.println("Enter marks in Social studies");
        float sst = sc.nextFloat();

        System.out.println("Enter marks in Computer");
        float comp = sc.nextFloat();

        float percentage = ((eng + maths + sst + comp + hindi)/500) * 100;
        System.out.println("Your overall percentage is "+ percentage + "%");
    }
}
