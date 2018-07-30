package chapter4.answers;

import common.Artist;
import common.Performance;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author Elizabeth Berg
 */
public class Question1 implements Performance {

    public String getName() {
        return "";
    }

    public Stream<Artist> getMusicians() {
        return null;
    }

    public static void main(String[] args) {
        Question1 question1 = new Question1();

        Artist sally = new Artist("Sally", "finnish");
        Artist tuomas = new Artist("Tuomas", "finnish");

        List<Artist> band = new ArrayList<>();

        band.add(sally);
        band.add(tuomas);

        Artist theBrownies = new Artist("The Brownies", band, "English");

        List<String> goo = question1.getAllMusicians(theBrownies);
        
        for (String name : goo) {
            System.out.println(name);
        }

    }

}
