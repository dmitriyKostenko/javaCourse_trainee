package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax3To5Then5() {
        int result = Max.max(3, 5);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax7To3Then7() {
        int result = Max.max(7, 3);
        assertThat(result, is(7));
    }

    @Test
    public void whenMax5To5Than5() {
        int result = Max.max(5, 5);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax3And5And7Then7() {
        int result = Max.max(3, 5, 7);
        assertThat(result, is(7));
    }

    @Test
    public void whenMax5And5And3Then5() {
        int result = Max.max(5, 5, 3);
        assertThat(result, is(5));
    }
}
