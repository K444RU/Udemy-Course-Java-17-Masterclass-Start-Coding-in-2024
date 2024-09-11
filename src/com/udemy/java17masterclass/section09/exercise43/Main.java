package java17masterclass.section09.exercise43;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};

        System.out.println("Original array:");
        ReverseArray.printArray(array);

        ReverseArray.reverse(array);

        System.out.println("Reversed array:");
        ReverseArray.printArray(array);
    }
}
