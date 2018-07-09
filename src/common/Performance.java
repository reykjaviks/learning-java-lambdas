package common;

import java.util.List;
import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;

import static java.util.stream.Stream.concat;

/* A Performance by some musicians - e.g., an Album or Gig */
public interface Performance {

    public String getName();

    public Stream<Artist> getMusicians();

    public default List<String> getAllMusicians(Artist artist) {
        return artist.getMembers()
                .map(member -> member.getName())
                .collect(toList());
    }

    public static List<String> findNames(List<old_common.Artist> artists) {
        return artists.stream()
                .map(artist -> artist.getName())
                .collect(toList());
    }

}
