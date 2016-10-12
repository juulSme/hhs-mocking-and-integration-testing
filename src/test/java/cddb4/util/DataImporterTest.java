package cddb4.util;

import cddb4.model.Album;
import cddb4.service.AlbumService;
import cddb4.service.TrackService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.verify;

/**
 * Created by Julien Smeets (jsmeets@quintor.nl) on 11-10-16.
 *
 * TODO: add a test to test the adding of tracks.
 * Make sure they are added to the right album.
 */
@RunWith(MockitoJUnitRunner.class)
public class DataImporterTest{

    @InjectMocks
    private DataImporter dataImporter = new DataImporter();

    @Mock
    AlbumService mockAlbumService = Mockito.mock(AlbumService.class);

    @Mock
    TrackService mockTrackService = Mockito.mock(TrackService.class);

    @Test
    public void testAlbumAdd() throws Exception{
        Album album = new Album();
        album.setArtist("Jan Smit");
        album.setName("Kattengejank 2");
        album.setYear(2012);

        dataImporter.importData();

        verify(mockAlbumService).saveAlbum(album);
    }
}