package com.company;
import java.util.Scanner;

public class cwh_18_elseif {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your age");
        int age = sc.nextInt();
                /*

        if (age > 56){
            System.out.println("You are experienced!");
        }
        else if (age > 46){
            System.out.println("You are semi experienced!");
        }
        else if(age > 36){
            System.out.println("You are semi semi experienced!");
        }
        else {
            System.out.println("You are not experienced");
        }
         */

        switch (age){
            case 18:
                System.out.println("You are going to become a adult now");
                break;
            case 23:
                System.out.println("You are going to get a job now");
                break;
            case 65:
                System.out.println("You are going to retire now");
                break;
            default:
                System.out.println("Enjoy Your Life");
    }
        System.out.println("Thanks for using java!");




    }

}
