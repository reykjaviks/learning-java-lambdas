package chapter4.sandbox;

import java.util.Arrays;
import java.util.LinkedList;

/**
 *
 * @author Elizabeth Berg
 */
public class ArraysToListsListsToArrays {

    public static void main(String[] args) {
        String[] roomArray = {"Floor", "Roof", "Walls"};

        LinkedList<String> roomList = new LinkedList<String>(Arrays.asList(roomArray));
        roomList.addFirst("Lamp");
        roomList.add("Dining Table");

        for (String item : roomList) {
            System.out.printf("%s ", item);
        }

        roomList.toArray(new String[roomList.size()]);

    }

}
