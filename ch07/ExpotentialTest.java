import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by media on 2016-07-08.
 */
public class ExpotentialTest {
    @Test
    public void readInput() throws Exception {

    }

    @Test
    public void factorial(){
        assertEquals(1.0,Expotential.factorial(0),0.001);
        assertEquals(120.0,Expotential.factorial(5),0.001);
    }

    @Test
    public void myexp() throws Exception {

    }

}