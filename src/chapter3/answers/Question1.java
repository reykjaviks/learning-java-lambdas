package chapter3.answers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

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
    public static int addByInternal_iteration(List<Integer> allNumbers) {
        return allNumbers.stream()
                         .reduce(0, (sum, number) -> sum + number);
    }

    public static void main(String[] args) {
        // 1. uses array and 2. and 3 use ArrayList
        Integer[] numbers = new Integer[] {1, 2, 3, 4, 5};
        List<Integer> numbersList = new ArrayList<>();

        // 1.
        System.out.println(addByLooping(numbers));

        // 2.
        numbersList.addAll(Arrays.asList(numbers));
        System.out.println(addByExternal_Iteration(numbersList));

        // 3.
        System.out.println(addByInternal_iteration(numbersList));

    }
}
