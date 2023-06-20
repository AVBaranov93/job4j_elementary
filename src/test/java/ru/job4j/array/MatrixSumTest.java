package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MatrixSumTest {

    @Test
    void whenSingleArray() {
        int[][] in = new int[][] {{15}};
        int expected = 15;
        int out = MatrixSum.sum(in);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    public void whenTwo() {
        int[][] array = {
                {1, 2},
                {1, 2}
        };
        int result = MatrixSum.sum(array);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenThree() {
        int[][] array = {
                {1, 2, 1},
                {1, 2, 0}
        };
        int result = MatrixSum.sum(array);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

}