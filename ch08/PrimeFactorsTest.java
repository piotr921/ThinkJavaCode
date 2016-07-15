import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Comarch on 2016-07-15.
 */
public class PrimeFactorsTest {

    @Test
    public void testInitArray() throws Exception {

    }

    @Test
    public void testIsPrime(){
        assertEquals(true,PrimeFactors.isPrime(7));
        assertEquals(false,PrimeFactors.isPrime(25));
    }

    @Test
    public void testArePrimeNumbers(){
        int[] array = new int[3];
        array[0] = 3;
        array[1] = 7;
        array[2] = 11;
        assertEquals(true, PrimeFactors.arePrimeNumbers(array));
        array[2] = 84;
        assertEquals(false, PrimeFactors.arePrimeNumbers(array));
    }

    @Test
    public void testAreMultipliesEquals(){
        int[] array = new int[3];
        array[0] = 3;
        array[1] = 9;
        array[2] = 11;
        assertEquals(true, PrimeFactors.areMultipliesEquals(297,array));
        assertEquals(false, PrimeFactors.areMultipliesEquals(597,array));
    }

    @Test
    public void testArePrimeFactors() throws Exception {

    }
}

