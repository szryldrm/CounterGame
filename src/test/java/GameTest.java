import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

import java.io.File;
import java.io.InputStream;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GameTest {
    // absolute location: if the resource resides at the root
    File file = new File("text.txt");


    //File Existing Test
    @Test
    public void testFileExist() throws Exception
    {
        assertEquals(file.exists(), true);
    }

    @Test
    public void testFileNullorNot() throws Exception
    {
        assertTrue(file.length() > 0);
    }

}
