package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SqrtServiceTest {

    @Test
    public void shouldCalcQuantitySqrsInRange1() {
        SqrtService service = new SqrtService();

        int expected = 3;
        int actual = service.calcSqrt(200, 300);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcQuantitySqrsInRange2() {
        SqrtService service = new SqrtService();

        int expected = 8;
        int actual = service.calcSqrt(200, 500);

        Assertions.assertEquals(expected, actual);
    }
}