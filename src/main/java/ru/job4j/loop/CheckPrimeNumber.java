package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        if (number == 1) {
            return prime = false;
        } else {
            for (int index = 2; index <= number; index++) {
                if ((number % index) == 0 && number > index) {
                    prime = false;
                    break;
                }
            }
            return prime;
        }
    }
}