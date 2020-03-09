package ru.job4j.lambda;

import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GroupTest {
    @Test
    public void groupByInterest() {
        var students = List.of(
                new Student("Nikolay", Set.of("Football", "Guitar")),
                new Student("Semen", Set.of("Football", "Mathematics")),
                new Student("Leonid", Set.of("Mathematics", "Guitar"))
        );
        var result = Group.sections(students);
        var expected = Map.of(
                "Football", Set.of("Nikolay", "Semen"),
                "Guitar", Set.of("Nikolay", "Leonid"),
                "Mathematics", Set.of("Semen", "Leonid")
        );
        assertThat(result, is(expected));
    }
}