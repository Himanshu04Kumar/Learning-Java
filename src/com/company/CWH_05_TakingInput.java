package com.company;
import java.util.Scanner;

public class CWH_05_TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking Input from Users");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number ");
        float first = sc.nextFloat();
//        int first = sc.nextInt();

        System.out.println("Enter second number ");
//        int second = sc.nextInt();
        float second = sc.nextFloat();
//        int sum = first+second;
        float sum = first + second;

        System.out.print("The sum is ");
        System.out.println(sum);



//        String name = sc.nextLine();
//        System.out.println(name);


//        boolean b1 = sc.hasNextInt();
//        System.out.println(b1);


    }
}
