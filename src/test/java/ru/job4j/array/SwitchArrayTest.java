package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SwitchArrayTest {
    @Test
    public void whenSwap0to3ThenChange3to0() {
        int source = 0;
        int dest = 3;
        int[] in = new int[] {1, 2, 3, 4, 5};
        int[] expected = new int[] {4, 2, 3, 1, 5};
        int[] out = SwitchArray.swap(in, source, dest);
        assertThat(out).containsExactly(expected);
    }

    @Test
    public void whenSwapMiddleThenChangeElementsInTheMiddle() {
        int[] in = new int[] {1, 2, 3, 4, 5};
        int source = in.length / 2;
        int dest = source - 1;
        int[] expected = new int[] {1, 3, 2, 4, 5};
        int[] out = SwitchArray.swap(in, source, dest);
        assertThat(out).containsExactly(expected);
    }
}