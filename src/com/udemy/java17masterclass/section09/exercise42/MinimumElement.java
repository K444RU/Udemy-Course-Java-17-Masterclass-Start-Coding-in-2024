package java17masterclass.section09.exercise42;

import java.util.Scanner;

public class MinimumElement {
    static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    static int[] readElements(int num) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[num];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}