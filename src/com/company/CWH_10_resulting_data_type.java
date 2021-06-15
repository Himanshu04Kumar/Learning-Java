package com.company;

public class CWH_10_resulting_data_type {
    public static void main(String[] args) {
        /* byte x = 10;
        int y = 6;
        short z = 8;
        int a = y + z;
        float b = 6.54f + x;
        System.out.println(b);
         */

//        Increment and decrement operators
        int i = 56;
//        int b = ++i;                         first b is assingned i(56) then i is incremented
        int j= 67;
//        int c = ++j;                           first j is incremented then c is assigned j(68)



        System.out.println(i++);
        System.out.println(i++);
        System.out.println(i++);
        System.out.println(i++);

        int k = 7;
        System.out.println(++k * 8);

        char cr = 'a';
        System.out.println(++cr);
    }
}
