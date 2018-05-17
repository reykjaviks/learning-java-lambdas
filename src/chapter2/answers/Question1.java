package chapter2.answers;

import java.util.function.Function;

/** Valid Function<Long, Long> implementations
 *
 * @author Elizabeth Berg
 */
public class Question1 {

    public static void main(String[] args) {
        // Correct
        Function<Long, Long> increment = x -> x + 1;
        Long result = increment.apply(4L);
        System.out.println(result);

        // Incorrect
        Function<Long, Long> incrementXY = (x, y) -> x + 1; // Compiler error: too many parameters
        Function<Long, Long> equalsOne = x -> x == 1; // Compiler error: bad return type
    }

}