/*
 * copyright
 */
package com.charter.sad.d;

import java.util.Collections;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * A test for {@link FooSubclass}.
 *
 * @author kblair
 */
public class FooTest {

    @Test
    public void testFooSubclass() {

        final Foo foosubclass = new FooSubclass();
        assertEquals("FooSubclass", foosubclass.bar(Collections.emptyList()));
    }
}
