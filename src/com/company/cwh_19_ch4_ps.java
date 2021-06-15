package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;

public class cwh_19_ch4_ps {
    public static void main(String[] args) {
//        question 2
//        int a = 10;
//        if (a == 11){
//            System.out.println("I am 11");
//        }
//        else {
//            System.out.println("I am not 11");
//        }



//        Question 2
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Marks in Physics");
//        byte phy = sc.nextByte();
//        System.out.println("Enter marks in Chemistry");
//        byte che = sc.nextByte();
//        System.out.println("Enter Your marks in Maths");
//        byte maths = sc.nextByte();
//        float percentage = (phy + che + maths)/3f;
//        System.out.println("Your overall percentage is " + percentage + "%");
//        if (percentage>=40 && phy>33 && che>33 && maths>33){
//            System.out.println("Congratulation! You have been promoted");
//        }
//        else {
//            System.out.println("Sorry! You have not been promoted \nTry again next year");
//        }



//        Question 3
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter You income");
//        float income = sc.nextFloat();
//        if (income <= 250000){
//            System.out.println("You don't need to pay tax");
//        }
//        else if (income > 250000 && income <= 500000){
//            float tax1 = (income *5)/100;
//            System.out.println("You need to pay 5% of your income that is Rs" + tax1 );
//        }
//        else if (income > 500000 && income <= 1000000){
//            float tax1 = (income *20)/100;
//            System.out.println("You need to pay 20% of your income that is Rs" + tax1 );
//        }
//        else if (income >1000000){
//            float tax1 = (income *30)/100;
//            System.out.println("You need to pay 30% of your income that is Rs" + tax1 );
//        }




//        Question 3
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number ");
//        byte num = sc.nextByte();
//        switch (num) {
//            case 1 -> System.out.println("Its Monday");
//            case 2 -> System.out.println("Its Tuesday");
//            case 3 -> System.out.println("Its Wednesday");
//            case 4 -> System.out.println("Its Thursday");
//            case 5 -> System.out.println("Its Friday");
//            case 6 -> System.out.println("Its Saturday");
//            case 7 -> System.out.println("Its Sunday");
//            default -> System.out.println("Enter number between 7!");
//        }




//        Question 4
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a Year");
//        int year = sc.nextInt();
//        if (year%400 ==0){
//            System.out.println("Its a leap year");
//        }
//        else if (year % 100 ==0){
//            System.out.println("Its not a leap year");
//        }
//        else if (year % 4 == 0){
//            System.out.println("Its a leap year");
//        }




//        Question 5
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the type of URL");
        String url = sc.nextLine();
        if (url.endsWith(".com")){
            System.out.println("Its a commercial Website");
        }
        else if (url.endsWith(".in")){
            System.out.println("Its an Indian Website");
        }
        else if (url.endsWith(".org")){
            System.out.println("Its an Orgination  Website");
        }
    }
}
