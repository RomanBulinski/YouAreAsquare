import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void shouldWorkForSomeExamples() throws Exception {
        assertEquals(false, Main.isSquare(-1));
        assertEquals(  true,   Main.isSquare(0));
        assertEquals( false,  Main.isSquare(3));
        assertEquals(   true,   Main.isSquare(4));
        assertEquals(  true,   Main.isSquare(25));
        assertEquals(false,  Main.isSquare(26));
    }
    
}
