package com.kodilla;



public class Calculator {


    public int addition(int a, int b)
    {
        return a+b;
    }

    public int subtraction(int a, int b)
    {
        return a-b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int add = calculator.addition(5,6);
        int subtract = calculator.subtraction(6,8);

        System.out.println(add);
        System.out.println(subtract);
    }

}
