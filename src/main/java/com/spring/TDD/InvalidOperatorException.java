package com.spring.TDD;

public class InvalidOperatorException extends RuntimeException {

    public InvalidOperatorException() {
        super("잘못된 연산자 입력 에러! (+, -, *, %)");
    }

}
