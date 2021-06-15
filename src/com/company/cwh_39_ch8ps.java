package com.company;
import java.util.Scanner;
import java.lang.Math;


//     Problem1
class Employee1{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}



//            Problem 2
class cellPhone{
    public void ringing(){
        System.out.println("Ringing...");
    }
    public void vibrating(){
        System.out.println("Vibrating...");
    }
    public void calling(){
        System.out.println("Calling Friend...");
    }

}




//        Problem 3
class square{
    int n;
    public int getArea(){
        int area = n*n;
        System.out.format("The area of the square is %d",  area);
        return area;
    }

        public int getPerimeter(){
        int perimeter = 4*n;
        System.out.println("The perimeter of the square is "+ perimeter);
        return perimeter;
    }
}




//        Problem 4
class Rectangle{
    int l;
    int b;
    public int getPerimeter(){
        int perimeter = 2*(l+b);
        System.out.println("The perimeter of the rectangle is "+ perimeter);
        return perimeter;
    }
    public int getArea(){
        int area = l*b;
        System.out.println("The area of the rectangle is "+ area);
        return area;
    }
}





//        Problem 5
class TommyVecetti{
    public void hit(){
        System.out.println("Hitting the enemy...");
    }
    public void run(){
        System.out.println("Running...");
    }
    public void firing(){
        System.out.println("Firing...");
    }
}



//      Problem 6
class Circle{
    int r;
    public float getPerimeter(){
        float perimeter = (float) (2 * Math.PI * r);
        System.out.println("The perimeter of the circle is "+ perimeter);
        return perimeter;
    }
    public float getArea(){
        float area = (float) (Math.PI * r * r);
        System.out.println("The area of the circle is "+ area);
        return area;
    }
}


public class cwh_39_ch8ps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Problem 1
//        Employee1 himanshu = new Employee1();
//        himanshu.name = "Himanshu Kumar";
//        himanshu.salary = 34;
//        System.out.println(himanshu.getName());
//        System.out.println(himanshu.getSalary() );



//        Problem 2
//        cellPhone redmi = new cellPhone();
//        redmi.calling();
//        redmi.vibrating();
//        redmi.calling();





//        Problem 3
//        square cal = new square();
//        cal.n = 5;
//        cal.getPerimeter();
//        cal.getArea();


//        Problem 4
//        Rectangle cal = new Rectangle();
//        System.out.println("Enter the length of the rectangle ");
//        cal.l = sc.nextInt();
//        System.out.println("Enter the breadth of the rectangle ");
//        cal.b = sc.nextInt();
//        cal.getArea();
//        cal.getPerimeter();




//        Problem 5
//        TommyVecetti player = new TommyVecetti();
//        player.firing();
//        player.hit();
//        player.run();


        Circle cal = new Circle();
        System.out.println("Enter the radius of the circle ");
        cal.r = sc.nextInt();
        cal.getArea();
        cal.getPerimeter();


    }
}
