package com.company;
import java.util.Scanner;

public class cwh_23_for_loops {
    public static void main(String[] args) {



//        for (int i = 1; i < 10; i++) {
//            System.out.println(i);
//        }




//        2n - Even Number - 0 , 2, 4, 6, 8, 10
//        2n+1 - Odd Numbers - 1, 3, 5, 7, 9, 11
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the ending number");
//        int i = sc.nextInt();
//        for (int j = 0; j < i; j++) {
//            System.out.println(2 * j + 1);
//        }




//        Decrementing LOOP
//        for (int i = 10; i>=0; i--){
//            System.out.println(i);
//        }


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        for (int j = n ; j!=0; j--){
            System.out.println(j);
        }
    }
}
