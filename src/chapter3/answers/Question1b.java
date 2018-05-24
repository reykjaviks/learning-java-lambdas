package chapter3.answers;

import common.Artist;
import common.InitArtists;
import java.util.List;
import static java.util.stream.Collectors.toList;

/**
 *
 * @author Elizabeth Berg
 */
public class Question1b {

    public static List<String> findNames(List<Artist> artists) {
        return artists.stream()
                .map(artist -> artist.getName())
                .collect(toList());
    }

    public static void main(String[] args) {
        List<Artist> artists = InitArtists.initNameOrigin();
        
        for (String name : findNames(artists)) {
            System.out.println(name);
        }
    }

}
