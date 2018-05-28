package chapter3.sandbox;

import static java.util.Arrays.asList;
import java.util.List;
import static java.util.stream.Collectors.toList;

/** Map the names of the friends to a list.
 *
 * @author Elizabeth Berg
 */
public class FindFriends {

    public static List<String> getNames(List<Friend> allFriends) {
        return allFriends.stream()
                         .map(friend -> friend.getName())
                         .collect(toList());
    }

    public static void main(String[] args) {
        List<Friend> allFriends = asList(new Friend("Jaakko", 30), new Friend("Tuomas", 28)); 
        System.out.println(getNames(allFriends).get(0));
    }
    
}
