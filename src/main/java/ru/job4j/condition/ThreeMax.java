package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        return maxOfTwo(first, second) > third ? maxOfTwo(first, second) : third;
    }

    private static int maxOfTwo(int first, int second) {
        return first > second ? first : second;
    }
}
