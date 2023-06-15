package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class DivideBySixTest {

    @Test
    void whenNumberDividesBy6() {
        int in = 12;
        String expected = "The number divides by 6.";
        String out = DivideBySix.checkNumber(in);
        assertThat(expected).isEqualTo(out);
    }

    @Test
    void whenNumberDividesBy3() {
        int in = 15;
        String expected = "The number divides by 3, but it isn't the even number.";
        String out = DivideBySix.checkNumber(in);
        assertThat(expected).isEqualTo(out);
    }

    @Test
    void whenNumberDividesBy2() {
        int in = 20;
        String expected = "The number doesn't divide by 3, but it is the even number.";
        String out = DivideBySix.checkNumber(in);
        assertThat(expected).isEqualTo(out);
    }

    @Test
    void whenNumberNoDivideBy3AndNotEven() {
        int in = 17;
        String expected = "The number doesn't divide by 3 and it isn't the even number.";
        String out = DivideBySix.checkNumber(in);
        assertThat(expected).isEqualTo(out);
    }

}