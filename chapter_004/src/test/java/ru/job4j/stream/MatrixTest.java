package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixTest {
    @Test
    public void convertMatrixToList() {
        Integer[][] matrix = {{1, 2, 3}, {4, 5}, {6, 7, 8}};
        List<Integer> result = new Matrix().convert(matrix);
        List<Integer> expect = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        assertThat(result.toString(), is(expect.toString()));
    }
}
