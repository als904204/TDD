package com.spring.TDD.sample2;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import com.spring.TDD.Calculator;
import com.spring.TDD.InvalidOperatorException;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void 덧셈_연산을_할_수_있다() {
        // given
        long num1 = 2;
        String operator = "+";
        long num2 = 3;

        Calculator calculator = new Calculator();

        long result = calculator.calculate(num1, operator, num2);

        assertThat(result).isEqualTo(5);
    }


    @Test
    void 뺄셈_연산을_할_수_있다() {
        // given
        long num1 = 2;
        String operator = "-";
        long num2 = 3;

        Calculator calculator = new Calculator();

        long result = calculator.calculate(num1, operator, num2);

        assertThat(result).isEqualTo(-1);
    }

    @Test
    void 곱셈_연산을_할_수_있다() {
        // given
        long num1 = 2;
        String operator = "*";
        long num2 = 3;

        Calculator calculator = new Calculator();

        long result = calculator.calculate(num1, operator, num2);

        assertThat(result).isEqualTo(6);
    }


    @Test
    void 나눗셈_연산을_할_수_있다() {
        // given
        long num1 = 2;
        String operator = "/";
        long num2 = 3;

        Calculator calculator = new Calculator();

        long result = calculator.calculate(num1, operator, num2);

        assertThat(result).isEqualTo(2);
    }


    @Test
    void 잘못된_연산자가_요청으로_들어올_경우_에러가_난다() {
        // given
        long num1 = 2;
        String operator = "x";
        long num2 = 3;

        Calculator calculator = new Calculator();

        assertThrows(InvalidOperatorException.class, () -> {
            calculator.calculate(num1, operator, num2);
        });
    }

}