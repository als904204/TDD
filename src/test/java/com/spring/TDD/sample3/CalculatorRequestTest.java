package com.spring.TDD.sample3;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import com.spring.TDD.BadRequestException;
import com.spring.TDD.InvalidOperatorException;
import org.junit.jupiter.api.Test;

class CalculatorRequestTest {

    @Test
    public void 유효한_숫자를_파싱할_수_있다() {
        // given
        String[] parts = new String[]{"2", "+", "3"};

        // when
        CalculatorRequest request = new CalculatorRequest(parts);

        // then
        assertThat(request.getNum1()).isEqualTo(2);
        assertThat(request.getOperator()).isEqualTo("+");
        assertThat(request.getNum2()).isEqualTo(3);
    }

    @Test
    public void 세자리_숫자가_넘어가는_유효한_숫자를_파싱할_수_있다() {
        // given
        String[] parts = new String[]{"232", "+", "333"};

        // when
        CalculatorRequest request = new CalculatorRequest(parts);

        // then
        assertThat(request.getNum1()).isEqualTo(232);
        assertThat(request.getOperator()).isEqualTo("+");
        assertThat(request.getNum2()).isEqualTo(333);
    }

    @Test
    public void 유효한_길이의_숫자가_들어오지_않으면_에러를_던진다() {
        // given
        String[] parts = new String[]{"232", "+"};

        // when
        // then
        assertThrows(BadRequestException.class, () -> {
            new CalculatorRequest(parts);
        });
    }


    @Test
    public void 유효하지_않은_연산자가_들어오면_에러를_던진다() {
        // given
        String[] parts = new String[]{"232", "x", "123"};

        // when
        // then
        assertThrows(InvalidOperatorException.class, () -> {
            new CalculatorRequest(parts);
        });
    }

    @Test
    public void 유효하지_않은_길이의_연산자가_들어오면_에러를_던진다() {
        // given
        String[] parts = new String[]{"232", "x-+*", "123"};

        // when
        // then
        assertThrows(InvalidOperatorException.class, () -> {
            new CalculatorRequest(parts);
        });
    }

}