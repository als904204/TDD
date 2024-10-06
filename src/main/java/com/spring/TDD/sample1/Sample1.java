package com.spring.TDD.sample1;

import com.spring.TDD.InvalidOperatorException;
import java.util.Scanner;

public class Sample1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("두 개의 숫자를 입력해주세요. (a + b) : ");
        String result = scanner.nextLine();
        String[] parts = result.split(" ");
        long num1 = Long.parseLong(parts[0]);
        long num2 = Long.parseLong(parts[2]);

        String operator = parts[1];

        /**
         * 리팩토링 전
         */
        long answer = switch (operator) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "%" -> num1 % num2;
            default -> throw new InvalidOperatorException();
        };

        System.out.println(answer);

    }

}
