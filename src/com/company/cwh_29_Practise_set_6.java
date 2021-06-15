package com.company;

public class cwh_29_Practise_set_6 {
    public static void main(String[] args) {
//        Practise Problem 1
//        float[] marks = {34.43f + 25.7f + 897.67f + 121.47f + 9889.76f};
//        float sum = 0;
//        for (float elements : marks) {
//            sum = sum + elements;
//        }
//        System.out.println("The sum is " + sum);




//        Practise Problem 2
//        int [] marks = {45,665,89,564,234,908};
//        int num = 45565;
//        boolean isInArray = false;
//        for (int elements : marks){
//            if (num==elements){
//                isInArray = true;
//                break;
//            }
//        }
//        if (isInArray){
//            System.out.println("This value is present in array");
//        }
//        else {
//            System.out.println("This value is not present in array");
//        }


//        Practise Problem 3
//        float[]marks = {98f, 56.46f, 78.5f, 65.89f, 33f};
//        float sum = 0;
//        for (float elements : marks){
//            sum += elements;
//
//        }
//        System.out.println("The average marks of students is " +sum/marks.length);

/*
//        Practise Problem 4
        int[][] mat1 = {{2, 4, 6},
                {1, 3, 5}};
        int[][] mat2 = {{2, 6, 8},
                {7, 3, 5}};
        int[][] result = {{0, 0, 0},
                {0, 0, 0}};
        for (int i=0; i<mat1.length; i++){
            for (int j=0; j<mat1[i].length; j++){
                System.out.format("Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        System.out.println();
        for (int i=0; i<mat1.length; i++){
            for (int j=0; j<mat1[i].length; j++){
                System.out.print(result[i][j]+" ");
                result[i][j] = mat1[i][j] + mat2[i][j];

            }
            System.out.println();
        }
 */




/*
//        Practise Problem 5
        int[] num = {1,2,3,4,5,6,7};
        int temp;
        int l = num.length;
        int a = Math.floorDiv(l , 2);
        for (int i=0; i<a; i++){
//            Swap a[i] and a[l-1-i]
//              a   b   temp
//            |4|   |3|    |temp|
            temp = num[i];
            num[i] = num[l-1-i];
            num[l-1-i] = temp;
        }
        for (int elements: num){
            System.out.print(elements + " ");
        }
 */

//        Practise Problem 5
//        int[] num = {1,2,3,4,5,6,7};
//        int max= 0;
//        for (int e: num){
//            if (e>max){
//                max= e;
//            }
//        }
//        System.out.println("The maximum value in this array is "+ max);





//        Practise Problem 6
//        int[] num = {1,2,3,4,5,6,7};
//        int min= Integer.MAX_VALUE;
//        for (int e: num){
//            if (e<min){
//                min= e;
//            }
//        }
//        System.out.println("The minimum value in this array is "+ min);



//        Practise Problem 7
        int[] num= {1,2,3,4,5,6,7,8,9};
        boolean isSorted = true;
        for (int i = 0; i<num.length-1; i++){
            if (num[i]>num[i+1]){
                isSorted = false;
                break;
            }
        }
        if (isSorted){
            System.out.println("The array is sorted");
        }
        else {
            System.out.println("This array is not sorted");
        }
    }
}
