package ru.job4j.calculator;

public class ArgMethod {
    public static void hello(String name, int age) {
        System.out.println(String.format("Hello %s, age = %d", name, age));
    }

    public static void main(String[] args) {
        String name = "Job4j";
        int age = 6;
        ArgMethod.hello(name, age);
        ArgMethod.hello(name, age);
        ArgMethod.hello(name, age);
        ArgMethod.hello(name, age);
    }
}
