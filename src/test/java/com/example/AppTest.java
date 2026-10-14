package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    App app = new App();

    @Test
    public void testLargestFirst() {
        assertEquals(30, app.largest(30, 20, 10));
    }

    @Test
    public void testLargestSecond() {
        assertEquals(40, app.largest(10, 40, 20));
    }

    @Test
    public void testLargestThird() {
        assertEquals(50, app.largest(10, 20, 50));
    }

    @Test
    public void testAllEqual() {
        assertEquals(5, app.largest(5, 5, 5));
    }

    @Test
    public void testNegativeNumbers() {
        assertEquals(-1, app.largest(-5, -1, -3));
    }
}
