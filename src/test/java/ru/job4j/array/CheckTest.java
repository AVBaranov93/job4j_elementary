package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CheckTest {

    @Test
    void whenArrayIsUniformThenTrue() {
        boolean out = Check.mono(new boolean[] {false, false, false, false});
        assertThat(out).isTrue();
    }

    @Test
    void whenArrayIsNotUniformThenFalse() {
        boolean out = Check.mono(new boolean[] {false, false, true, false, false});
        assertThat(out).isFalse();
    }
}