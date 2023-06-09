package ru.job4j.condition;

public class Greeting {
    public static void main(String[] args) {
        String idea = "I like Java!";
        System.out.println(idea);
        idea += "But I am a newbie.";
        int year = 2023;
        idea += year;
        System.out.println(idea);
        char a = 'A';
        System.out.println(++a);
        char d = 'D';
        System.out.println(--d);
        int i1 = a;
        int i2 = d;
        System.out.println(i1 + System.lineSeparator() + i2 + System.lineSeparator() + (i1 + i2));
    }
}
