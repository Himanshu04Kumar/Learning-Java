package com.company;

public class cwh_31_varargs {
//    static int sum(int a, int b ){
//        return a+b;
//    }
//    static int sum(int a, int b, int c ){
//        return a+b+c;
//    }
//    static int sum(int a, int b, int c, int d ){
//        return a+b+c+d;
//    }
//    static int sum(int a, int b, int c, int d, int e){
//        return a+b+c+d+e;
//    }

//    static int sum (int x, int ...arr)                  // WILL REQUIRE AT LEAST ONE NUMBER DUE TO int x
    static int sum(int ...arr){
//        Available as int[] arr
        int result = 0;
        for (int a: arr){
            result +=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to varargs tutorial");
        System.out.println("The sum of nothing is "+ sum());
        System.out.println("The sum of 2 ,3 is "+ sum(2,3));
        System.out.println("The sum of 2 ,3, 4 is "+ sum(2,3,4));
        System.out.println("The sum of 2 ,3, 4, 5 is "+ sum(2,3,4,5));
        System.out.println("The sum of 2 ,3, 4, 5, 6 is "+ sum(2,3,4,5,6));
    }
}
