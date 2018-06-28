package chapter4.sandbox;

import old_common.Album;
import old_common.Artist;
import old_common.InitArtists;
import java.util.IntSummaryStatistics;
import java.util.List;

/**
 *
 * @author Elizabeth Berg
 */
public class Foo {
    
    public static void printTrackLengthStatistics(Album album) {
    IntSummaryStatistics trackLengthStats
            = album.getTracks()
                   .mapToInt(track -> track.getLength())
                   .summaryStatistics();

    System.out.printf("Max: %d, Min: %d, Ave: %f, Sum: %d",
                      trackLengthStats.getMax(),
                      trackLengthStats.getMin(),
                      trackLengthStats.getAverage(),
                      trackLengthStats.getSum());
}

    public static void main(String[] args) {
    }
    
}
