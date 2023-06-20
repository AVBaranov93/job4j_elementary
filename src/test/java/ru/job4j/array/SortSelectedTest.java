package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SortSelectedTest {

    @Test
    void whenArray48231543ThenSortedArray12334458() {
        int[] in = new int[] {4, 8, 2, 3, 1, 5, 4, 3};
        int[] expected = new int[] {1, 2, 3, 3, 4, 4, 5, 8};
        assertThat(SortSelected.sort(in)).containsExactly(expected);
    }

    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }
}