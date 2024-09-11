package java17masterclass.section09.exercise41;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of integers you want to sort:");
        int size = scanner.nextInt();

        int[] array = SortedArray.getIntegers(size);

        System.out.println("Original array:");
        SortedArray.printArray(array);

        int[] sortedArray = SortedArray.sortIntegers(array);

        System.out.println("Sorted array in descending order:");
        SortedArray.printArray(sortedArray);
    }
}
