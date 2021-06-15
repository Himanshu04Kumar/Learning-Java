package com.company;
import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissor {
    public static void main(String[] args) {

        Random rn = new Random();
        Scanner sc = new Scanner(System.in);

        int guess = rn.nextInt(3);
        System.out.println("Enter The following \n0 -- for Rock\n1 -- for Scissor\n2 -- Paper");
        int user = sc.nextInt();
        if(guess == user){
        System.out.println("Its a Draw!");
        }
        else {
            System.out.println("Still Working");
        }
    }
}
