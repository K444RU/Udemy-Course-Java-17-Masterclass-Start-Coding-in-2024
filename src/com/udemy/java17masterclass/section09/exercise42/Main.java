package java17masterclass.section09.exercise42;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements:");
        int numberOfElements = MinimumElement.readInteger();

        System.out.println("Enter " + numberOfElements + " integers:");
        int[] elements = MinimumElement.readElements(numberOfElements);

        int minValue = MinimumElement.findMin(elements);
        System.out.println("The minimum value is: " + minValue);
    }
}
