package com.company;
/**
 * lab6.Garden
 *
 * @author Oleinych Danyil
 * @vesrsion 1.0
 * @since 2020-10-30|20.00
 */
public class Garden extends Rectangle {
    private int cost;
    private int numOfCultures;
    private int numOfDom;
    private int numOfSub;
    private int age;

    public Garden(int a_side, int b_side, int cost, int numOfCultures, int numOfDom, int numOfSub, int age) {
        super(a_side, b_side);
        this.cost = cost;
        this.numOfCultures = numOfCultures;
        this.numOfDom = numOfDom;
        this.numOfSub = numOfSub;
        this.age = age;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getNumOfCultures() {
        return numOfCultures;
    }

    public void setNumOfCultures(int numOfCultures) {
        this.numOfCultures = numOfCultures;
    }

    public int getNumOfDom() {
        return numOfDom;
    }

    public void setNumOfDom(int numOfDom) {
        this.numOfDom = numOfDom;
    }

    public int getNumOfSub() {
        return numOfSub;
    }

    public void setNumOfSub(int numOfSub) {
        this.numOfSub = numOfSub;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPrice(){
        return(int)(this.getCost()*this.getArea());
    }

    @Override
    public String toString() {
        return "Garden{" +
                "cost=" + cost +
                ", numOfCultures=" + numOfCultures +
                ", numOfDom=" + numOfDom +
                ", numOfSub=" + numOfSub +
                ", age=" + age +
                '}';
    }
}
