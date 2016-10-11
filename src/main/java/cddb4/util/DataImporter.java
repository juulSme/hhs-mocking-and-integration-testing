package cddb4.util;

import cddb4.model.Album;
import cddb4.model.Track;
import cddb4.service.AlbumService;
import cddb4.service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Julien Smeets (jsmeets@quintor.nl) on 11-10-16.
 */
@Component
public class DataImporter {
    private static final String resourcePrefix = "data/";
    private static final String albumFile = "albums.csv";
    private static final String trackFile = "tracks.csv";

    @Autowired
    private AlbumService albumService;

    @Autowired
    private TrackService trackService;

    @PostConstruct
    public void importData(){
        importAlbums();
        importTracks();
    }

    private void importAlbums(){
        try(BufferedReader reader =
                    new BufferedReader(
                            new InputStreamReader(getClass()
                                    .getClassLoader()
                                    .getResourceAsStream(resourcePrefix + albumFile)))){
            reader.lines()
                    .map(s -> {
                        String[] a = s.split(";");
                        if(a.length != 3) throw new RuntimeException("Illegal album format.");
                        Album album = new Album();
                        album.setArtist(a[0]);
                        album.setName(a[1]);
                        album.setYear(Integer.parseInt(a[2]));
                        return album;
                    })
                    .forEach(a -> albumService.saveAlbum(a));
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private void importTracks(){
        try(BufferedReader reader =
                    new BufferedReader(
                            new InputStreamReader(getClass()
                                    .getClassLoader()
                                    .getResourceAsStream(resourcePrefix + trackFile)))){
            reader.lines()
                    .map(s -> {
                        String[] t = s.split(";");
                        if(t.length != 4) throw new RuntimeException("Illegal track format.");
                        Track track = new Track();
                        track.setAlbum(albumService.findByArtistName(t[0], t[1]));
                        track.setTracknr(Integer.parseInt(t[2]));
                        track.setName(t[3]);
                        return track;
                    })
                    .forEach(t -> trackService.saveTrack(t));
        } catch (IOException e){
            e.printStackTrace();
        }
    }

}
