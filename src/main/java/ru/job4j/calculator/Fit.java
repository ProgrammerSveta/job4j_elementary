package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height1 = 187;
        short height2 = 167;
        double man = Fit.manWeight(height1);
        System.out.println("Man " + height1 + " is " + man);
        double woman = Fit.womanWeight(height2);
        System.out.println("Woman " + height2 + " is " + woman);
    }

}