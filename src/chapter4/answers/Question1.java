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
        
        List<Artist> listOfArtists = new ArrayList<>();
        listOfArtists.add(sally);
        listOfArtists.add(tuomas);

        Artist theBrownies = new Artist("The Brownies", listOfArtists, "English");
        
        // Erroneus, fix it
        System.out.println(question1.getAllMusicians(theBrownies));

    }

}
