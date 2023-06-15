package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LogicNotTest {

    @Test
    void whenIsEvenThenTrue() {
        int in = 10;
        boolean expected = true;
        boolean out = LogicNot.isEven(in);
        assertThat(expected).isEqualTo(out);
    }

    @Test
    void whenPositiveThenTrue() {
        int in = 2;
        boolean expected = true;
        boolean out = LogicNot.isPositive(in);
        assertThat(expected).isEqualTo(out);
    }

    @Test
    void whenNotEvenThenTrue() {
        int in = 15;
        boolean expected = true;
        boolean out = LogicNot.notEven(in);
        assertThat(expected).isEqualTo(out);
    }

    @Test
    void whenNotPositiveThenTrue() {
        int in = -12;
        boolean expected = true;
        boolean out = LogicNot.notPositive(in);
        assertThat(expected).isEqualTo(out);
    }

    @Test
    void whenNotEvenAndPositiveThenTrue() {
        int in = 7;
        boolean expected = true;
        boolean out = LogicNot.notEvenAndPositive(in);
        assertThat(expected).isEqualTo(out);
    }

    @Test
    void whenEvenOrNotPositiveThenTrue() {
        int in = -7;
        boolean expected = true;
        boolean out = LogicNot.evenOrNotPositive(in);
        assertThat(expected).isEqualTo(out);
    }
}