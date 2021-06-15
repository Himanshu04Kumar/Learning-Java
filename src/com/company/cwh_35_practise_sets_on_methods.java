package com.company;

public class cwh_35_practise_sets_on_methods {

    //    Problem 1
//    static void table(int x) {
//        int r = 10;
//        for (int i = 1; i <= r; i++) {
//            System.out.format("%d X %d = %d\n", x, i, x * i);
//        }
//    }


    //   Problem 2
//    static void pattern1(int n) {
//        for (int r = 1; r <= n; r++) {
//            for (int c = 1; c <= r; c++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }




/*
//    Practise Problem 3
//    sum(n) = 1 + 2 + 3 ...n
//    sum(n) = 1 + 2 + 3 ...n-1 + n
//    sum(n) = sum(n-1) + n
//    sum(n) = 3 + sum(2)
//    sum(n) = 3 + 2 + sum(1)
//    sum(n) = 3 + 2 + 1
    static int sumRec(int n){
//        Base Condition
        if (n==1){
            return 1;
        }
        return n + sumRec(n-1);
    }
 */




//    Practise Problem 4
//    static void pattern2(int n){
//        for (int r=1; r<=n; r++){
//            for (int c=r; c<=n; c++){
//                System.out.print    ("* ");
//            }
//            System.out.println();
//        }
//    }


//    Practise Problem 5
//    static int fab(int n){
//        if (n==1 || n==2){
//            return n-1;
//        }
//        else {
//            return fab(n-1) + fab(n-2);
//        }
//    }








//     Practise Problem 6
//    static float avg(float ...arr){
//    float sum = 0, average= 0;
//    int l = arr.length;
//    for (float elements: arr){
//        sum = sum += elements;
//    }
//    average = sum/l;
//    return average;
//    }







    public static void main(String[] args) {

//        Problem 1
//        table(5);

//        Problem 2
//        pattern1(5);

//         Problem 3
//        int c = sumRec(10);
//        System.out.println(c);



//        Problem 4
//        pattern2(5);



//        Problem 5
//        Fibonacci Sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
//        int result = fab(4);
//        System.out.println(result);



//        Problem 5
//        float []array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
//        System.out.println("The average of the array is " + avg(array) );


    }
}
