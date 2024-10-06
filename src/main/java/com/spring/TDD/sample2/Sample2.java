package com.spring.TDD.sample2;

import com.spring.TDD.Calculator;

public class Sample2 {

    public static void main(String[] args) {

        CalculatorRequestReader2 reader = new CalculatorRequestReader2();

        String[] read = reader.read();

        long num1 = Long.parseLong(read[0]);
        long num2 = Long.parseLong(read[2]);

        String operator = read[1];

        long answer = new Calculator().calculate(num1, operator, num2);
        System.out.println(answer);

    }

}
