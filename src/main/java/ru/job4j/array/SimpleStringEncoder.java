package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        int count = 0;
        int indexOutOfBounds = 0;
        for (int i = 0; i < input.length(); i++) {
            indexOutOfBounds++;
            if (indexOutOfBounds == input.length()) {
                result += count == 0 ? input.charAt(i) : input.charAt(i) + Integer.toString(count + 1);
                break;
            } else if (input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {
                result += count == 0 ? input.charAt(i) : input.charAt(i) + Integer.toString(count + 1);
                count = 0;
            }
        }
        return result;
    }
}
