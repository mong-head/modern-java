package com.yujin.example;

public class OopAnotherEx {

    public static void main(String[] args) {
        final CalculatorService calculatorService = new CalculatorService();

        final int result = calculatorService.calculate(1,2);
        System.out.println(result);

    }
}

class CalculatorService {
    public int calculate(int num1, int num2){
        return num1 + num2;
    }
}