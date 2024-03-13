import java.util.Arrays;

public class FindMaxElement {

    public static void main(String[] args) {
        int[] array = {7, 12, 4, 9, 5, 18, 10};

      
        int maxElement = findMaxElement(array);

        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Maximum Element: " + maxElement);
    }

    private static int findMaxElement(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        return Arrays.stream(array).max().orElseThrow();
    }
}
