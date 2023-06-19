package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TurnTest {

    @Test
    void whenArray12345ThenReverseArray54321() {
        int[] in = new int[] {1, 2, 3, 4, 5};
        int[] expected = new int[] {5, 4, 3, 2, 1};
        int[] out = Turn.back(in);
        assertThat(out).containsExactly(expected);
    }

    @Test
    void whenArray3456ThenReverseArray6543() {
        int[] in = new int[] {3, 4, 5, 6};
        int[] expected = new int[] {6, 5, 4, 3};
        int[] out = Turn.back(in);
        assertThat(out).containsExactly(expected);
    }
}