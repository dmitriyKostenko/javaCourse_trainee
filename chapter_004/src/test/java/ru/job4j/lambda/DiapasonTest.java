package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DiapasonTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        Diapason function = new Diapason();
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunctionThenFunctionResults() {
        Diapason function = new Diapason();
        List<Double> result = function.diapason(2, 5, x -> Math.pow(x, 2) + x + 1);
        List<Double> expected = Arrays.asList(7D, 13D, 21D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLogarithmicFunctionThenFunctionResults() {
        Diapason function = new Diapason();
        List<Double> result = function.diapason(6, 9, x -> Math.log(x) / Math.log(2));
        List<Double> expected = Arrays.asList(2.50, 2.80, 3.0);
        Iterator<Double> iterResult = result.iterator();
        Iterator<Double> iterExpect = expected.iterator();
        assertThat(iterResult.next(), is(closeTo(iterExpect.next(), 0.1)));
    }
}
