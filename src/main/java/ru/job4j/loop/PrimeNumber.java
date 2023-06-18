package ru.job4j.loop;

public class PrimeNumber {
    public static int calc(int finish) {
        int count = 0;
        /*boolean isTrue = true;
        for (int i = 2; i <= finish; i++) {
            for (int j = i - 1; j < finish; j++) {
                if (i % j == 0) {
                    isTrue = false;
                    break;
                }
            }
            if (isTrue) {
                count++;
            }
            isTrue = true;
        }*/
        boolean isTrue = finish > 1;
        for (int i = 2; i <= finish; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isTrue = false;
                    break;
                }
            }
            if (isTrue) {
                count++;
            }
            isTrue = true;
        }
        return count;
    }
}
