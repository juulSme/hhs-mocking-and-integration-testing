package cddb4.util;

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

/**
 * Created by Julien Smeets (jsmeets@quintor.nl) on 11-10-16.
 *
 * TODO: see pom.xml to add maven dependency for Mockito
 * TODO: annotate class
 * TODO: inject mocks into dataImporter
 * TODO: mock the AlbumService and TrackService
 * hint: see the documentation for Mockito.mock()
 */
public class DataImporterTest{
    private DataImporter dataImporter = new DataImporter();

    @Test
    public void testTest() throws Exception {
        assertThat("test", is(equalTo("test")));
    }
}