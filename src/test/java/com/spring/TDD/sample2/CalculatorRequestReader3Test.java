package com.spring.TDD.sample2;

import static org.assertj.core.api.Assertions.assertThat;

import com.spring.TDD.sample3.CalculatorRequest;
import com.spring.TDD.sample3.CalculatorRequestReader3;
import java.io.ByteArrayInputStream;
import org.junit.jupiter.api.Test;

class CalculatorRequestReader3Test {

    @Test
    void System_in_으로_데이터를_읽어들일_수_있다() {

        // given
        CalculatorRequestReader3 reader = new CalculatorRequestReader3();

        // when
        System.setIn(new ByteArrayInputStream("2 + 3".getBytes()));
        CalculatorRequest result = reader.read();

        // then
        assertThat(result.getNum1()).isEqualTo(2);
        assertThat(result.getOperator()).isEqualTo("+");
        assertThat(result.getNum2()).isEqualTo(3);

    }
}