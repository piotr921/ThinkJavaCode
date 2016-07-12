import com.sun.org.apache.xpath.internal.operations.Equals;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by media on 2016-06-30.
 */
public class MultiaddTest {
    @Test
    public void testmultiadd(){
            assertEquals(5.0,Multiadd.multiadd(1.0,2.0,3.0),0.1);
    }
}