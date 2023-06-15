package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PointEqTest {

    @Test
    void whenAllPointsEqualsThenTrue() {
        int x1 = 1;
        int x2 = 1;
        int y1 = 2;
        int y2 = 2;
        boolean expected = true;
        boolean out = PointEq.eq(x1, y1, x2, y2);
        assertThat(expected).isEqualTo(out);
    }
}