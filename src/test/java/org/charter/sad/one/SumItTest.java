package org.charter.sad.one;

import static org.junit.Assert.*;
import org.junit.Test;

public class SumItTest {

    @Test
    public void testSum() throws Exception {

        SumIt sumIt = new SumIt();

        assertEquals(12, sumIt.sum(3, 5));
    }
}