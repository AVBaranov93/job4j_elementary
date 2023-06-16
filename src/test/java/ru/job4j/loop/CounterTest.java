package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    void whenStart0AndFinish5ThenSum15() {
        int start = 0;
        int finish = 5;
        int expected = 15;
        int out = Counter.sum(start, finish);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int expected = 30;
        int out = Counter.sumByEven(start, finish);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromTheToTwentyThenNinety() {
        int start = 10;
        int finish = 20;
        int expected = 90;
        int out = Counter.sumByEven(start, finish);
        assertThat(out).isEqualTo(expected);
    }
}