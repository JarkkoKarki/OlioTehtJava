import org.junit.Test;
import static org.junit.Assert.*;

public class StringManipulatorTest {

    @Test
    public void testConcatenate() {
        StringManipulator sm = new StringManipulator();
        assertEquals("HeiHei", sm.concatenate("Hei", "Hei"));
    }

    @Test
    public void testFindLength() {
        StringManipulator sm = new StringManipulator();
        assertEquals(6, sm.findLength("Moikka"));
    }

    @Test
    public void testConvertToUpperCase() {
        StringManipulator sm = new StringManipulator();
        assertEquals("TERVE", sm.convertToUpperCase("terve"));
    }

    @Test
    public void testConvertToLowerCase() {
        StringManipulator sm = new StringManipulator();
        assertEquals("terve", sm.convertToLowerCase("TERVE"));
    }

    @Test
    public void testContainsSubstring() {
        StringManipulator sm = new StringManipulator();
        assertTrue(sm.containsSubstring("HelloWorld", "World"));
        assertFalse(sm.containsSubstring("HelloWorld", "world"));
    }
}