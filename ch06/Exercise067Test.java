import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by media on 2016-07-06.
 */
public class Exercise067Test {
    @Test
    public void testIsPositiveAndOdd(){
        assertEquals(true, Exercise067.isPositiveAndOdd(3));
        assertEquals(false, Exercise067.isPositiveAndOdd(2));
        assertEquals(false, Exercise067.isPositiveAndOdd(-1));
    }

    @Test
    public void oddSum() throws Exception {

    }

}