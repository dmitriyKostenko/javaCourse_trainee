package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void whenFirstMax() {
        SqMax check = new SqMax();
        int result = check.max(8, 7, 5, 3);
        assertThat(result, is(8));
    }

    @Test
    public void whenSecondMax() {
        SqMax check = new SqMax();
        int result = check.max(5, 7, 5, 3);
        assertThat(result, is(7));
    }

    @Test
    public void whenThirdMax() {
        SqMax check = new SqMax();
        int result = check.max(4, 7, 9, 3);
        assertThat(result, is(9));
    }

    @Test
    public void whenForthMax() {
        SqMax check = new SqMax();
        int result = check.max(3, 7, 5, 10);
        assertThat(result, is(10));
    }

    @Test
    public void whenAllEqualis() {
        SqMax check = new SqMax();
        int result = check.max(5, 5, 5, 5);
        assertThat(result, is(5));
    }
}
