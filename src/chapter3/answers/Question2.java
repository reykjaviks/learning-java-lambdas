package chapter3.answers;

import old_common.Artist;
import static java.util.Arrays.asList;
import java.util.List;
import java.util.stream.Stream;

/** Refactor external_Iteration to use internal iteration.
 *
 * @author Elizabeth Berg
 */
public class Question2 {
    public static int external_Iteration(List<Artist> artists) {
        int totalMembers = 0;
        for (Artist artist : artists) {
            Stream<Artist> members = artist.getMembers();
            totalMembers += members.count();
        }
        return totalMembers;
    }

    public static Long internal_Iteration(List<Artist> artists) {
        return artists.stream()
                .flatMap(artist -> artist.getMembers())
                .count();
    }

    public static void main(String[] args) {
        Artist Sonoio = new Artist("Sonoio", "Los Angeles, California");
        Artist Alessandro = new Artist("Alessandro Cortini", "Los Angeles, California");
       // Sonoio.addMembers(Alessandro);
        List<Artist> artists = asList(Sonoio);
    }

}
