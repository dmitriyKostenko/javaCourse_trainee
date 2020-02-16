package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class UniqueTextTest {
    @Test
    public void isEquals() {
        String origin = "My cats eats a mouse";
        String text = "My cats eats a mouse";
        assertThat(UniqueText.isEquals(origin, text), is(true));
    }

    @Test
    public void isNotEquals() {
        String origin = "My cats eats a mouse";
        String text = "Mouses are eaten by the cat";
        assertThat(UniqueText.isEquals(origin, text), is(false));
    }
}
