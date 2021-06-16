package com.company;
import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The following \n0 -- for Rock\n1 -- for Paper\n2 -- Scissor");
        int userInput = sc.nextInt();

        Random rn = new Random();
        int computerInput = rn.nextInt(3);

            if (userInput == computerInput) {
                System.out.println("Draw!");
            } else if (userInput == 0 && computerInput == 1 || userInput == 1 && computerInput == 2 || userInput == 2 && computerInput == 0) {
                System.out.println("Computer Win!");
            } else {
                System.out.println("You Win!");
            }
            if (computerInput == 0) {
                System.out.println("Computer Choice Rock");
            }
            if (computerInput == 1) {
                System.out.println("Computer Choice Paper");
            }
            if (computerInput == 2) {
                System.out.println("Computer Choice Scissor");
            }
        }

    }
