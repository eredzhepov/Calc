package org.example;

public class Calc {
    public int summ(int a, int b) {
        int result = a +  b;
        System.out.printf("Сумма %d + %d равна %d\n",a, b, result );
        return result;
    }
    public int minus(int a, int b) {
        int result = a -  b;
        System.out.printf("Разность %d - %d равна %d\n",a, b, result );
        return result;
    }
}
