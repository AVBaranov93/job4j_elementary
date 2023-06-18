package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PrimeNumberTest {

    @Test
    void whenFinishTenThenCountFour() {
        int in = 10;
        int expected = 4;
        int out = PrimeNumber.calc(in);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenFinishTwentyThenCountSeven() {
        int in = 20;
        int expected = 8;
        int out = PrimeNumber.calc(in);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenFinishFifteenThenCountFour() {
        int in = 15;
        int expected = 6;
        int out = PrimeNumber.calc(in);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    public void when5() {
        int finish = 5;
        int result = PrimeNumber.calc(finish);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when11() {
        int finish = 11;
        int result = PrimeNumber.calc(finish);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when2() {
        int finish = 2;
        int result = PrimeNumber.calc(finish);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }
}