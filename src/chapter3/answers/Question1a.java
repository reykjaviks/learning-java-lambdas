package chapter3.answers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/** Three ways to add up numbers.
 *
 * @author Elizabeth Berg
 */
public class Question1a {
    // 1. The traditional approach by using a for loop
    public static int addUpByLooping(Integer[] allNumbers) {
        int sum = 0;
        for (int number : allNumbers) {
            sum += number;
        }
        return sum;
    }

    // 2. External iteration
    public static int addUpExternally(List<Integer> allNumbers) {
        int sum = 0;
        Iterator<Integer> iterator = allNumbers.iterator();
        while (iterator.hasNext()) {
            sum += iterator.next();
        }
        return sum;
    }

    // 3. Internal iteration using Streams
    public static int addUpInternally(List<Integer> allNumbers) {
        return allNumbers.stream()
                         .reduce(0, (sum, number) -> sum + number);
    }

    public static void main(String[] args) {
        // 1. takes an array as a parameter and 2. and 3. take a list
        Integer[] numbersArray = new Integer[] {1, 2, 3, 4, 5};
        
        List<Integer> numbersList = new ArrayList<>();
        numbersList.addAll(Arrays.asList(numbersArray));

        // 1.
        System.out.println(addUpByLooping(numbersArray));

        // 2.
        System.out.println(addUpExternally(numbersList));

        // 3.
        System.out.println(addUpInternally(numbersList));

    }
}
