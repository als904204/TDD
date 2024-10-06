package com.spring.TDD.sample3;

import com.spring.TDD.Calculator;
import com.spring.TDD.sample2.CalculatorRequestReader2;

public class Sample3 {

    public static void main(String[] args) {

        CalculatorRequestReader3 reader = new CalculatorRequestReader3();
        CalculatorRequest request = reader.read();

        long answer = new Calculator().calculate(request.getNum1(), request.getOperator(),
            request.getNum2());


        System.out.println(answer);

    }

}
