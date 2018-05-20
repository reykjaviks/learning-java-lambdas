package chapter3.answers;

import java.util.stream.Stream;

/** Three ways to add up numbers.
 *
 * @author Elizabeth Berg
 */
public class Question1 {
    // 1. The traditional approach using a for loop
    public static int addUpByLooping(int[] allNumbers) {
        int sum = 0;
        for (int number : allNumbers) {
            sum += number;
        }
        return sum;
    }

    // 2. External iteration
    public static int addUpByExternal_Iteration() {
        return 0;
    }
    // 3. Internal iteration using Streams
    public static int addUpByInternal_iteration(Stream<Integer> numbers) {
        return 0;
    }

    public static void main(String[] args) {
        int[] numbers2 = {1, 2, 3, 4, 5};

    }
}
