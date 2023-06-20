package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RollBackArrayTest {

    @Test
    void whenArray12345ThenReverseArray54321() {
        int[] in = new int[] {1, 2, 3, 4, 5};
        int[] expected = new int[] {5, 4, 3, 2, 1};
        assertThat(RollBackArray.rollback(in)).containsExactly(expected);
    }

    @Test
    void whenArray5678ThenReverseArray8765() {
        int[] in = new int[] {5, 6, 7, 8};
        int[] expected = new int[] {8, 7, 6, 5};
        assertThat(RollBackArray.rollback(in)).containsExactly(expected);
    }

    @Test
    public void whenEmpty() {
        int[] input = new int[] {};
        int[] expected = new int[] {};
        int[] result = RollBackArray.rollback(input);
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenOne() {
        int[] input = new int[] {1};
        int[] expected = new int[] {1};
        int[] result = RollBackArray.rollback(input);
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenTheSame() {
        int[] input = new int[] {1, 1, 1, 1};
        int[] expected = new int[] {1, 1, 1, 1};
        int[] result = RollBackArray.rollback(input);
        assertThat(result).containsExactly(expected);
    }
}