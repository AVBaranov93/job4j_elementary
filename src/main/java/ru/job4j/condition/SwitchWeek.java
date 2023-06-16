package ru.job4j.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        String name;
        switch (day) {
            case 1:
                name = "monday";
                break;
            case 2:
                name = "tuesday";
                break;
            case 3:
                name = "wensday";
                break;
            case 4:
                name = "thusday";
                break;
            case 5:
                name = "friday";
                break;
            case 6:
                name = "saturday";
                break;
            case 7:
                name = "sonday";
                break;
            default:
                name = "error";
                break;
        }
        return name;
    }
}
