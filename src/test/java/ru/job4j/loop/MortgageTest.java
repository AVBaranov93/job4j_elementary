package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MortgageTest {

    @Test
    void whenAmount1000Salary1200Percent1ThenYear1() {
        int amount = 1000;
        int salary = 1200;
        double percent = 0.01;
        int expected = 1;
        int out = Mortgage.year(amount, salary, percent);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    public void whenAmount100Salary120Percent50ThenYear2() {
        int amount = 100;
        int salary = 120;
        double percent = 0.5;
        int result = Mortgage.year(amount, salary, percent);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenAmount1000Salary1200Percent20ThenYear1() {
        int amount = 1000;
        int salary = 1200;
        double percent = 0.2;
        int result = Mortgage.year(amount, salary, percent);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }
}