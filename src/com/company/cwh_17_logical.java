package com.company;

public class cwh_17_logical {
    public static void main(String[] args) {


//        Logiacal AND
        System.out.println("For logical AND...");
        boolean a = true;
        boolean b = true;
        boolean c = true;
        boolean cond = (a && b && c);
        if (cond){
            System.out.println("Y");
        }
        else{
            System.out.println("F");
        }





//      Logiacl OR
        System.out.println("For logical OR...");
        boolean A = true;
        boolean B = false;
        boolean C = false;
        boolean cond1 = (A || B || C);
        if (cond1){
            System.out.println("Y");
        }
        else{
            System.out.println("F");
        }




//        Logical NOT
        System.out.println("For logical OR...");
        boolean X = true;
        boolean Y = true;
            System.out.print("Not(x) is ");
            System.out.println(!X);
            System.out.print("Not(y) is ");
            System.out.println(!Y);
    }
}
