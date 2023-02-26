package ru.netology.javaqa.javaqamvn.services;

public class SQRservice {
    public int calcSqrt(int min, int max){
        int result = 0;

        for (int i = 10; i <= 99; i++) {

            if (i * i >= min) {
                if (i * i <= max){
                    result = result + 1;
                }
            }

        }

        return result;

    }
}
