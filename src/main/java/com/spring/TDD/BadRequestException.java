package com.spring.TDD;

public class BadRequestException extends RuntimeException {

    public BadRequestException() {
        super("잘못된 값 요청, 3개 이상의 값을 입력해주세요");
    }

}
