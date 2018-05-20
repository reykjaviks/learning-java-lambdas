package chapter2.answers;

import javax.swing.JButton;

/** Type inference rules
 *
 * @author Elizabeth Berg
 */
public class Question3 {

    public static void main(String[] args) {
        // a is okay
        Runnable helloWorld = () -> System.out.println("hello world");
        helloWorld.run();

        // b is okay
        JButton button = new JButton();
        button.addActionListener(event ->
            System.out.println(event.getActionCommand()));
    }

}
