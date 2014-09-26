package com.charter.sad.c;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfig.class})
public class ServiceTest {

    @Autowired
    private Service service;

    @Test
    public void testDoingSomethingOne() throws Exception {
        assertEquals("One", service.doingSomething());
    }

    @Test
    public void testDoingSomethingTwo() throws Exception {
        assertEquals("Two", service.doingSomething());
    }
}