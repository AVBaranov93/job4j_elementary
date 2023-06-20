package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MatrixCheckTest {

    @Test
    void whenHasMonoHorizontalThenTrue() {
        char[][] array = new char[][] {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '}
        };
        int raw = 1;
        assertThat(MatrixCheck.monoHorizontal(array, raw)).isTrue();
    }

    @Test
    void whenDoesNotHaveMonoHorizontalThenFalse() {
        char[][] array = new char[][] {
                {' ', ' ', ' '},
                {' ', '0', ' '},
                {'0', ' ', ' '}
        };
        int raw = 1;
        assertThat(MatrixCheck.monoHorizontal(array, raw)).isFalse();
    }

    @Test
    public void whenHasMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        int column = 2;
        boolean result = MatrixCheck.monoVertical(input, column);
        assertThat(result).isTrue();
    }

    @Test
    public void whenDoesNotHaveMonoVertical() {
        char[][] input = {
                {' ', ' ', ' '},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        int column = 2;
        boolean result = MatrixCheck.monoVertical(input, column);
        assertThat(result).isFalse();
    }

}