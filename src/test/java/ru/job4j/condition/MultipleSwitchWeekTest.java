package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MultipleSwitchWeekTest {

    @Test
    void whenThusdayInRusThe4() {
        String in = "четверг";
        int expected = 4;
        int out = MultipleSwitchWeek.numberOfDay(in);
        assertThat(expected).isEqualTo(out);
    }

    @Test
    void whenThusdayInEngThe4() {
        String in = "thusday";
        int expected = 4;
        int out = MultipleSwitchWeek.numberOfDay(in);
        assertThat(expected).isEqualTo(out);
    }
}