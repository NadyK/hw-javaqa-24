package ru.netology.sqr;

public class SQRService {
    public int sqrCalculate(int lower, int upper) {
        int number = 0;
        for (int i = 10; i <= 99; i++) {

            if (i * i >= lower && i * i <= upper) {
                number++;
            }
        }
        return number;
    }
}