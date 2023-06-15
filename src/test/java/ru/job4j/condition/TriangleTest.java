package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TriangleTest {

    @Test
    void whenExistThenTrue() {
        int ab = 10;
        int bc = 10;
        int ac = 12;
        boolean out = Triangle.exist(ab, bc, ac);
        assertThat(out).isTrue();
    }

    @Test
    void whenNotExistThenFalse() {
        int ab = 10;
        int bc = 10;
        int ac = 100;
        boolean out = Triangle.exist(ab, bc, ac);
        assertThat(out).isFalse();
    }
}