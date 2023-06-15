package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    void whenFirstMoreThanSecondThenFirst() {
        int first = 20;
        int second = 10;
        int expected = 20;
        int out = Max.max(first, second);
        assertThat(expected).isEqualTo(out);
    }

    @Test
    void whenSecondMoreThanFirstThenSecond() {
        int first = 10;
        int second = 20;
        int expected = 20;
        int out = Max.max(first, second);
        assertThat(expected).isEqualTo(out);
    }

    @Test
    void whenSecondEqualsToFirstThenAnyOfThem() {
        int first = 10;
        int second = 10;
        int expected = 10;
        int out = Max.max(first, second);
        assertThat(expected).isEqualTo(out);
    }
}