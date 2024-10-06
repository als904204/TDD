package com.spring.TDD.sample2;

import java.util.Scanner;

public class CalculatorRequestReader2 {

    public String[] read() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("두 개의 숫자를 입력해주세요. (a + b) : ");
        String result = scanner.nextLine();
        return result.split(" ");
    }
}
