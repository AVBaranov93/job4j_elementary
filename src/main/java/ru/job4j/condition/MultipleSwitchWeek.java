package ru.job4j.condition;

public class MultipleSwitchWeek {
    public static int numberOfDay(String name) {
        return switch (name) {
            case "monday", "понедельник" -> 1;
            case "tuesday", "вторник" -> 2;
            case "wensday", "среда" -> 3;
            case "thusday", "четверг" -> 4;
            case "friday", "пятница" -> 5;
            case "saturday", "суббота" -> 6;
            case "sonday", "воскресенье" -> 7;
            default -> -1;
        };
    }
}
