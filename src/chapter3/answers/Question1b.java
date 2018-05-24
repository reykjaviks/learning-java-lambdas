package chapter3.answers;

import common.Artist;
import static java.util.Arrays.asList;
import java.util.List;
import static java.util.stream.Collectors.toList;

/**
 *
 * @author Sally
 */
public class Question1b {

    public static List<String> findNames(List<Artist> artists) {
        return artists.stream()
                .map(artist -> artist.getName())
                .collect(toList());
    }

    public static void main(String[] args) {
        List<Artist> artists = asList(new Artist("Kylie Minogue", "Melbourne, Australia"),
                                      new Artist("Dido", "London, The United Kingdom"),
                                      new Artist("Sonoio", "Los Angeles, California"));

        for (String name : findNames(artists)) {
            System.out.println(name);
        }
    }

}
