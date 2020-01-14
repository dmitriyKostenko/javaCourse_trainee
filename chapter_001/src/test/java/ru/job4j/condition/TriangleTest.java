package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenExist() {
        Point ap = new Point(0, 0);
        Point bp = new Point(4, 0);
        Point cp = new Point(0, 3);
        Triangle abc = new Triangle(ap, bp, cp);
        double expected = 6.0;
        double out = abc.area();
        assertThat(expected, is(out));
    }

    @Test
    public void whenDoesNotExist() {
        Point ap = new Point(0, 0);
        Point bp = new Point(4, 0);
        Point cp = new Point(3, 0);
        Triangle abc = new Triangle(ap, bp, cp);
        double expected = -1;
        double out = abc.area();
        assertThat(expected, is(out));
    }
}
