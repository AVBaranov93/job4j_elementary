package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class DummyBotTest {

    @Test
    public void whenGreetBot() {
        String in = "Hi, Bot.";
        String expected = "Hi, SmartAss.";
        String out = DummyBot.answer(in);
        assertThat(expected).isEqualTo(out);
    }

    @Test
    public void whenByeBot() {
        String in = "Bye.";
        String expected = "See you later.";
        String out = DummyBot.answer(in);
        assertThat(expected).isEqualTo(out);
    }

    @Test
    public void whenUnknownBot() {
        String in = "What time is it?";
        String expected = "I don't know. Please, ask another question.";
        String out = DummyBot.answer(in);
        assertThat(expected).isEqualTo(out);
    }
}