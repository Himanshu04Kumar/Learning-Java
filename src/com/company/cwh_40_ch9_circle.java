package com.company;
import java.lang.Math;
import java.util.Scanner;

class circle{
    float r;
    private float area;
    private float perimeter;

    public void setArea(int a){
        area = a;
    }
    public float getArea(){
        area = (float) (Math.PI *r *r);
        return area;
    }

    public void setPerimeter(int p){
        perimeter = p;
    }
    public float getPerimeter(){
        perimeter = (float) (2 * Math.PI * r);
        return perimeter;
    }

}
public class cwh_40_ch9_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        circle cal = new circle();


        System.out.println("Enter Radius ");
        cal.r = sc.nextFloat();
        System.out.println("Enter Area ");
        cal.setArea((int) sc.nextFloat());
        float area = sc.nextFloat();
        System.out.println("Enter Perimeter ");
        cal.setPerimeter((int) sc.nextFloat());
        float perimeter = sc.nextFloat();


        if (area == cal.getArea() && perimeter == cal.getPerimeter()){
            System.out.println("Your calculation is all right. Enjoy!!");
        }
        else if (area != cal.getArea()){
            System.out.println("Calculation of area is incorrect!");
        }
        else if (perimeter != cal.getPerimeter()){
            System.out.println("Calculation of area is incorrect!");
        }
        else {
            System.out.println();
        }

    }
}
