import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static java.lang.Math.random;
import java.util.Arrays;

public class MinimumSteps {
    @Test
    public void checkSmallArraySize() {
        doTest(new int[]{4,6,3}, 7, 1);
        doTest(new int[]{10,9,9,8}, 17, 1);
    }
    @Test
    public void checkLargerArraySize() {
        doTest(new int[]{8,9,4,2}, 23, 3);
        doTest(new int[]{19,98,69,28,75,45,17,98,67}, 464, 8);
    }
    @Test
    public void testRandomNumbers() {
        for(int trial = 1; trial <= 100; trial++) {
            int[] numbers = new int[(int)(3 + random() * 199)]; // Vector size range: [3, 202)
            for (int i = 0; i < numbers.length; i++)
                numbers[i] = (int)(1 + random() * 200); // Element value range: [1, 200)
            int[] arr = Arrays.copyOf(numbers, numbers.length);
            Arrays.sort(arr);
            int k = 0, expected = (int)(random() * numbers.length);
            for (int i = 0; i <= expected; i++) k += arr[i];
            doTest(numbers, k, expected);
        }
    }
    private void doTest(int[] numbers, int k, int expected) {
        assertEquals(expected, Kata.minimumSteps(numbers, k));
    }
}