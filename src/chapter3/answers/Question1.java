package chapter3.answers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/** Three ways to add up numbers.
 *
 * @author Elizabeth Berg
 */
public class Question1 {
    // 1. The traditional approach using a for loop
    public static int addByLooping(Integer[] allNumbers) {
        int sum = 0;
        for (int number : allNumbers) {
            sum += number;
        }
        return sum;
    }

    // 2. External iteration
    public static int addByExternal_Iteration(List<Integer> allNumbers) {
        int sum = 0;
        Iterator<Integer> iterator = allNumbers.iterator();
        while (iterator.hasNext()) {
            sum += iterator.next();
        }
        return sum;
    }
    // 3. Internal iteration using Streams
    public static int addByInternal_iteration(Stream<Integer> numbers) {
        return 0;
    }

    public static void main(String[] args) {
        // 1. Method
        Integer[] numbers = new Integer[] {1, 2, 3, 4, 5};
        System.out.println(addByLooping(numbers));

        // 2. Method
        List<Integer> numbersList = new ArrayList<>();
        numbersList.addAll(Arrays.asList(numbers));
        System.out.println(addByExternal_Iteration(numbersList));

        // 3. Method

    }
}
