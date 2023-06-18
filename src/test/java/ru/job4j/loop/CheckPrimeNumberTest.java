package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CheckPrimeNumberTest {

    @Test
    void whenNumberIsNotSimpleThenFalse() {
        int in = 10;
        boolean expected = false;
        boolean out = CheckPrimeNumber.check(in);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenNumberIsSimpleThenTrue() {
        int in = 5;
        boolean expected = true;
        boolean out = CheckPrimeNumber.check(in);
        assertThat(out).isEqualTo(expected);
    }
}