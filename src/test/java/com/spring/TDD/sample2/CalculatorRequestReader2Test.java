package com.spring.TDD.sample2;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayInputStream;
import org.junit.jupiter.api.Test;

class CalculatorRequestReader2Test {

    @Test
    void System_in_으로_데이터를_읽어들일_수_있다() {

        // given
        CalculatorRequestReader2 reader = new CalculatorRequestReader2();

        // when
        System.setIn(new ByteArrayInputStream("2 + 3".getBytes()));
        String[] result = reader.read();

        // then
        assertThat(result[0]).isEqualTo("2");
        assertThat(result[1]).isEqualTo("+");
        assertThat(result[2]).isEqualTo("3");

    }
}