package common;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author Elizabeth Berg
 */
public class Artist {
    private String name;
    private String origin;
    private List<Artist> members;
    
    public Artist(String name, String origin) {
        this.name = name;
        this.origin = origin;
        this.members = new ArrayList<>();
    }

    public void addMembers(Artist artist) {
        this.members.add(artist);
    }

    public String getName() {
        return this.name;
    }
    public Stream<Artist> getMembers() {
        return this.members.stream();
    }
}
