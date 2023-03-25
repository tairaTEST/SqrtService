package ru.netology.javaqa.javaqamvn.services;

public class SqrtService {

    public int calcSqrt(int minimumRange, int maximumRange) {
        int quantity = 0;

        for (int i = 10; i <= 99; i++)
            if (((i * i) >= minimumRange) && ((i * i) <= maximumRange)) {
                quantity++;
            }

        return quantity;
    }
}

