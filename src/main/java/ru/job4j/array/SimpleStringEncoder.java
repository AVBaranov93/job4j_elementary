package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        int count = 1;
        for (int i = 0; i < input.length(); i++) {
            if (i + 1 != input.length() && input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {
                result += count == 1 ? input.charAt(i) : input.charAt(i) + Integer.toString(count);
                count = 1;
            }
        }
        return result;
    }
}
