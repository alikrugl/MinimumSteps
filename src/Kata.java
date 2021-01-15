import java.util.Arrays;

public class Kata {

    /**
     * Given an array of N integers, find how many times need to to add up the smallest numbers in the array until
     * their Sum becomes greater or equal to K.
     * <p>
     * - List size is at least 3.
     * - All numbers will be positive.
     * - Numbers could occur more than once , (Duplications may exist).
     * - Threshold K will always be reachable.
     */
    public static int minimumSteps(int[] arr, int k) {
        int i = 0;
        Arrays.sort(arr);

        while ((k -= arr[i]) > 0) {
            i++;
        }

        return i;
    }

}