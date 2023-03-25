package ru.netology.javaqa.javaqamvn.services;

public class SqrtService {

    public int calcSqrt(int x, int y) {
        int kolichestvo = 0;

        for (int i = 10; i <= 99; i++)
            if (((i * i) >= x) && ((i * i) <= y)) {
                kolichestvo++;
            }

        return kolichestvo;
    }
}

