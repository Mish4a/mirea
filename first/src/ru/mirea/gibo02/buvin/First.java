package ru.mirea.gibo02.buvin;
import java.lang.*;
public class First {
    public static void main(String[] args) {
        System.out.println("Hello world!\n");
  /*
        int a, b, c;
        a=10;
        b=12;
        c=a+b;
        System.out.println("c = " + c + " :D");
        */
        Rectangle p1 = new Rectangle(10, 15);
        System.out.println(p1);
        p1.setA_side(6);
        p1.setB_side(9);
        System.out.println(p1);
        int s= p1.getA_side()* p1.getB_side();
        System.out.println("Area = " + s);
        System.out.println("Area = " + p1.getArea());
        Circle c1 = new Circle(100);
        System.out.println("Circle Area = "+ c1.GetCArea());
    }
}
