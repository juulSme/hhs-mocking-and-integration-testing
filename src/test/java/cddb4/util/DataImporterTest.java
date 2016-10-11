package cddb4.util;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by Julien Smeets (jsmeets@quintor.nl) on 11-10-16.
 */
public class DataImporterTest{
    @Test
    public void testTest() throws Exception {
        assertThat("test", is(equalTo("test")));
    }
}