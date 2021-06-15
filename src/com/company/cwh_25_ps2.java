package com.company;
import  java.util.Scanner;

public class cwh_25_ps2 {
    public static void main(String[] args) {


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of row");



//        Square
//        int n = sc.nextInt();
//        for(int r = 1; r<=n; r++){
//            for (int c = 1; c<=n; c++ ){
//                System.out.print("*  ");
//            }
//            System.out.println();
//        }




//      Increasing Pyramid
//        int n = sc.nextInt();
//        for (int r = 1; r<=n ; r++){
//            for (int c = 1; c<=r; c++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//        Decreasing Pyramid

//        int n = sc.nextInt();
//        int n = 5;
//        for (int r= 1; r<=n; r++){
//            for (int c = r; c<=n; c++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }





//Right sided triangle
//        int n = 5;
//        for (int r=1; r<=n; r++){
//            for (int c=r; c<=n; c++) {
//                System.out.print("  ");
//            }
//            for (int c1=1; c1 <=r; c1++){
//                System.out.print("* ");
//
//            }
//            System.out.println();
//        }



//        Right sided triangle
//int n = 5;
//for (int r = 1; r<=n ; r++){
//    for (int c = 1; c<+r ; c++){
//        System.out.print("  ");
//    }
//    for (int c1=r; c1<=n; c1++){
//        System.out.print("* ");
//    }
//    System.out.println();
//}

//          HILL PATTERN
//        int n = 5;
//        for (int r = 1; r<=n; r++) {
//            for (int c = r; c<=n; c++){
//                System.out.print("  ");
//        }
//            for (int c1= 1; c1<=r-1; c1++){
//                System.out.print("# ");
//            }
//            for (int c2 = 1; c2<=r; c2++){
//                System.out.print("# ");
//            }
//            System.out.println();
//        }


//       Practise Problem 2
//        int sum = 0;
//        int n = 999999999;
//        for (int i=1; i<=n; i++){
//            sum = sum + (2*i);
//        }
//        System.out.println("The sum of even number is "+ sum);



//        Practise problem 3                    MULTIPLICATION
//        int n = 5;
//        int range = 10;
//        for (int i =1; i<=range ; i++){
//            System.out.printf("%d X %d = %d\n", n , i , n*i);
//        }



//        Practise problem 4                  REVERSE MULTIPLICATION
//        int n = 10;
//        int range = 10;
//        for (int i=range; i>0 ; i--){
//            System.out.printf("%d X %d = %d\n", n, i , n*i);
//        }



//        Practise Problem 5                 FIND THE VALUE OF FACTORIAL
//        int n = 5;
//        int factorial = 1;
//        for (int i = 1; i<=n; i++){
//            factorial *= i;
//        }
//        System.out.println(factorial);



//        Practise Problem 6                   FIND THE FACTORIAL USING WHILE LOOP
//        int n = 9;
//        int factorial = 1;
//        int i = 1;
//        while (i<=n){
//            factorial *= i;
//            i++;
//        }
//        System.out.println(factorial);


//        Practise Problem 9                 FIND THE SUM OF MULTIPLICATION OF 8
        int n = 8;
        int range = 10;
        int sum = 0;
        for (int i=1; i<=range; i++){
            int multi = n * i;
            System.out.printf("%d X %d = %d\n", n , i ,multi );
            sum += multi;

        }
        System.out.println("The sum is "+ sum);


    }

}
