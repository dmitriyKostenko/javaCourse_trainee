package ru.job4j.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class SchoolTest {
    List<Student> students = Arrays.asList(
            new Student("Antonov", 20),
            new Student("Borisov", 35),
            new Student("Vasilev", 45),
            new Student("Konstantinov", 55),
            new Student("Nikolaev", 65),
            new Student("Yuriev", 75),
            new Student("Yakovlev", 90)
    );

    @Test
    public void whenSortedToClass10A() {
        School school = new School();
        List<Student> result = school.collect(students,
                student -> student.getScore() >= 70 && student.getScore() <= 100);
        List<Student> expect = Arrays.asList(
                new Student("Yuriev", 75),
                new Student("Yakovlev", 90)
        );
        assertThat(result.toString(), is(expect.toString()));
    }

    @Test
    public void whenSortedToClass10B() {
        School school = new School();
        List<Student> result = school.collect(students,
                student -> student.getScore() >= 50 && student.getScore() < 70);
        List<Student> expect = Arrays.asList(
                new Student("Konstantinov", 55),
                new Student("Nikolaev", 65)
        );
        assertThat(result.toString(), is(expect.toString()));
    }

    @Test
    public void whenSortedToClass10V() {
        School school = new School();
        List<Student> result = school.collect(students,
                student -> student.getScore() >= 0 && student.getScore() < 50);
        List<Student> expect = Arrays.asList(
                new Student("Antonov", 20),
                new Student("Borisov", 35),
                new Student("Vasilev", 45)
        );
        assertThat(result.toString(), is(expect.toString()));
    }

    @Test
    public void whenConvertStudentsListToMap() {
        Map<String, Student> result = new School().listToMap(students);
        assertThat(result.values(), containsInAnyOrder(students.toArray()));
    }

    @Test
    public void whenLevelMoreThen50() {
        List<Student> result = new School().levelOf(students, 50);
        List<Student> expect = Arrays.asList(
                new Student("Konstantinov", 55),
                new Student("Nikolaev", 65),
                new Student("Yuriev", 75),
                new Student("Yakovlev", 90)
        );
        assertThat(result.toString(), is(expect.toString()));
    }
}
