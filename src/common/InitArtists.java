package common;

import static java.util.Arrays.asList;
import java.util.List;

/**
 *
 * @author Elizabeth Berg
 */
public class InitArtists {

    public static List<Artist> initNameOrigin() {
        return asList(new Artist("Kylie Minogue", "Melbourne, Australia"),
               new Artist("Dido", "London, The United Kingdom"),
               new Artist("Sonoio", "Los Angeles, California"));
    }

}
