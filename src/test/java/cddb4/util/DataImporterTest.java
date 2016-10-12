package cddb4.util;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by Julien Smeets (jsmeets@quintor.nl) on 11-10-16.
 *
 * TODO: write a unit test that checks whether albums from albums.csv are loaded into the AlbumService
 */
public class DataImporterTest{
    private DataImporter dataImporter = new DataImporter();

    @Test
    public void testAlbumLoading() throws Exception {
        assertThat("test", is(equalTo("test")));
    }
}