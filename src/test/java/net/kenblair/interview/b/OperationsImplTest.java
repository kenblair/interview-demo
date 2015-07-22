package net.kenblair.interview.b;

import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class OperationsImplTest {

    private Set<String> c1;
    private Set<String> c2;

    @Before
    public void setUp() throws Exception {

        c1 = new HashSet<>();
        c2 = new HashSet<>();

        c1.add("A");
        c1.add("B");
        c1.add("C");
        c1.add("D");
        c1.add("E");

        c2.add("B");
        c2.add("D");
        c2.add("F");
        c2.add("G");
        c2.add("H");
    }

    @Test
    public void testIntersect() throws Exception {

        final Collection<String> result = new Operations().intersect(c1, c2);
        assertNotNull(result);
        assertEquals(2, result.size());
        assertTrue(result.contains("B"));
        assertTrue(result.contains("D"));
    }

    @Test
    public void testUnion() throws Exception {

        final Collection<String> result = new Operations().union(c1, c2);
        assertNotNull(result);
        assertEquals(8, result.size());
        assertTrue(result.contains("A"));
        assertTrue(result.contains("B"));
        assertTrue(result.contains("C"));
        assertTrue(result.contains("D"));
        assertTrue(result.contains("E"));
        assertTrue(result.contains("F"));
        assertTrue(result.contains("G"));
        assertTrue(result.contains("H"));
    }
}