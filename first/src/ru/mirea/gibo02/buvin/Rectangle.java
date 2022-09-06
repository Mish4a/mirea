package ru.mirea.gibo02.buvin;

public class Rectangle {
    private int a_side;
    private int b_side;

    public int getA_side() {
        return a_side;
    }

    public void setA_side(int a_side) {
        this.a_side = a_side;
    }

    public int getB_side() {
        return b_side;
    }

    public void setB_side(int b_side) {
        this.b_side = b_side;
    }

    public Rectangle(int a_side, int b_side) {
        this.a_side = a_side;
        this.b_side = b_side;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a_side=" + a_side +
                ", b_side=" + b_side +
                '}';
    }
public int getArea(){
        return a_side*b_side;
}
}
