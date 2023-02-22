package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double substractionAndDivide(double first, double second) {
        return subtraction(first, second)
                + divide(first, second);
    }

    public static double sumOfFour(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + subtraction(first, second)
                + divide(first, second);
    }

        public static void main(String[] args) {
            System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
            System.out.println("Результат расчета равен: " + substractionAndDivide(10, 20));
            System.out.println("Результат расчета равен: " + sumOfFour(10, 20));
    }
}