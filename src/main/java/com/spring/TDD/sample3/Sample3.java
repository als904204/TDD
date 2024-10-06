package com.spring.TDD.sample3;

import com.spring.TDD.Calculator;
import com.spring.TDD.sample2.CalculatorRequestReader2;

public class Sample3 {

    public static void main(String[] args) {

        CalculatorRequestReader2 reader = new CalculatorRequestReader2();
        String[] prats = reader.read();

        CalculatorRequest request = new CalculatorRequest(prats);

        long answer = new Calculator().calculate(request.getNum1(), request.getOperator(),
            request.getNum2());


        System.out.println(answer);

    }

}
