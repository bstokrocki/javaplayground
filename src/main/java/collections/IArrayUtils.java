package collections;

public interface IArrayUtils {
    /**
     * Sums all the items in given array
     */
    int sum(int[] numbers);

    /**
     * Finds the largest number in given array
     */
    int findLargestNumber(int[] numbers);

    /**
     * Calculates average from numbers in given array
     */
    double calculateAverage(double[] numbers);

    /**
     * Joins all texts in given array into a single text
     */
    String join(String[] texts);

    /**
     * Returns first two numbers from given array
     */
    int[] takeFirstTwoNumbers(int[] numbers);
}
