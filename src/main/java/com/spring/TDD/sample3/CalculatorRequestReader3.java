package com.spring.TDD.sample3;

import java.util.Scanner;

public class CalculatorRequestReader3 {

    public CalculatorRequest read() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("두 개의 숫자를 입력해주세요. (a + b) : ");
        String result = scanner.nextLine();
        String[] parts = result.split(" ");
        return new CalculatorRequest(parts);
    }
}
