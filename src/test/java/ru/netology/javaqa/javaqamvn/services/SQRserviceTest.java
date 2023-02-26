package ru.netology.javaqa.javaqamvn.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import ru.netology.javaqa.javaqamvn.services.SQRservice;

public class SQRserviceTest {

    @Test
    public void shouldCalcExact() {
        SQRservice service = new SQRservice();

        int expected = 7;
        int actual = service.calcSqrt(300, 600);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void schouldCalcExact2() {
        SQRservice service = new SQRservice();

        int expected = 15;
        int actual = service.calcSqrt(100, 600);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcExact3() {
        SQRservice service = new SQRservice();

        int expected = 0;
        int actual = service.calcSqrt(599, 600);

        Assertions.assertEquals(expected, actual);
    }

}
