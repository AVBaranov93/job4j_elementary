package ru.job4j.array;

public class SwitchArray {
    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    public static void main(String[] args) {
        for (int value : swapBorder(new int[] {1, 2, 3, 4, 5, 6})) {
            System.out.println(value);
        }
    }
}
