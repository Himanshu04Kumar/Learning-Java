package com.company;

public class CWH_09_ch2_op_pre {
    public static void main(String[] args) {


        //        Precedence and Associativity

//        int a = 6*5 - 34/2;
//        System.out.println(a);
        /* Highest precedence goes to * and /. They are then evaluated on the basis of left to right associativity
            = 30-34/2
            =30 -17
            =13
         */



//        int b = 60/5 - 34*2;
//        System.out.println(b);
        /*  = 12 - 34*2
            = 12 - 68
            = -56
         */

//        Quick Quiz 1
//        int x = 12;
//        int y = 6;
//        int k = x * y/2;
//        System.out.println(k);




//        Quiz 2
        int a = 2;
        int b = 3;
        int c = 4;

       int y = b*b - (4*a*c)/(2*a);
        System.out.println(y);


    }
}
