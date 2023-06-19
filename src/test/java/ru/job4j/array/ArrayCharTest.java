package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ArrayCharTest {

    @Test
    void whenStartWithPrefixThenTrue() {
        char[] word = new char[] {'u', 'n', 'i', 'f', 'o', 'r', 'm'};
        char[] prefix = new char[] {'u', 'n', 'i', 'f'};
        assertThat(ArrayChar.startsWith(word, prefix)).isTrue();
    }

    @Test
    void whenNotStartWithPrefixThenFalse() {
        char[] word = new char[] {'u', 'n', 'i', 'f', 'o', 'r', 'm'};
        char[] prefix = new char[] {'u', 'n', 'i', 'q'};
        assertThat(ArrayChar.startsWith(word, prefix)).isFalse();
    }
}