package com.company;

import jdk.dynalink.linker.ConversionComparator;

public class CWH_Ch2_Operators {
    public static void main(String[] args) {


//   1.     Arithmetic Operators
        int a= 4;
//        int b = 6 % a;  //  Module operator
//        4.8% 1.1 ---> Return Decimal Remaiander



//    2.    Assignment OPerators
        int b = 9;
//        b+=3;
        b *= 3;
        System.out.println(b);

//   3.     Comparision Operators
        System.out.println(6 == 6);
        System.out.println(6 >90);


//   4.     Logical operator
        System.out.println(64>5 && 64>43);
        System.out.println(64>5 || 64>100);



//    5.    Bitwise operators
//        10
//        11
//     ---------
//        10
        System.out.println(2&3);

    }
}
