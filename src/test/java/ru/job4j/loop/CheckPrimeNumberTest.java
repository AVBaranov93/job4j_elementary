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

    @Test
    public void when5() {
        int number = 5;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isTrue();
    }

    @Test
    public void when4() {
        int number = 4;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isFalse();
    }

    @Test
    public void when1() {
        int number = 1;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isFalse();
    }
}