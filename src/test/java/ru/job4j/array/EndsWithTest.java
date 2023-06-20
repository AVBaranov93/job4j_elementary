package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class EndsWithTest {

    @Test
    void whenStringEndsWithSubstringThenTrue() {
        char[] word = new char[] {'l', 'e', 's', 's', 'o', 'n'};
        char[] post = new char[] {'o', 'n'};
        assertThat(EndsWith.endsWith(word, post)).isTrue();
    }

    @Test
    void whenStringDoesNotEndsWithSubstringThenFalse() {
        char[] word = new char[] {'l', 'e', 's', 's', 'o', 'n'};
        char[] post = new char[] {'q', 'o', 'n'};
        assertThat(EndsWith.endsWith(word, post)).isFalse();
    }
}