package com.company;
/**
 * lab6.Rectangle
 *
 * @author Oleinych Danyil
 * @vesrsion 1.0
 * @since 2020-10-30|20.00
 */
public class Rectangle {
    private int a_side;
    private int  b_side;

    public Rectangle(int a_side, int b_side){
        this.a_side = a_side;
        this.b_side = b_side;
    }

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

    @Override
    public String toString() {
        return "Rectangle{" +
                "a_side=" + a_side +
                ", b_side=" + b_side +
                '}';
    }
    public int getDiagonal(){
        return this.getA_side()*this.getA_side()+this.getB_side()*this.getB_side();
    }
    public int getPerimeter(){
        return 2*(this.getA_side()+this.getB_side());
    }
    public int getArea(){
        return this.getA_side()*getB_side();
    }
}
