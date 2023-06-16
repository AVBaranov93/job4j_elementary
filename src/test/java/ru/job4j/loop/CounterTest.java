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
        assertThat(expected).isEqualTo(out);
    }
}