package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class School {
    List<Student> collect(List<Student> students, Predicate<Student> predicate) {
        return students.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }

    Map<String, Student> listToMap(List<Student> students) {
        return students.stream()
                .distinct()
                .collect(Collectors.toMap(
                        Student::getName,
                        student -> student
                ));
    }

    public List<Student> levelOf(List<Student> students, int bound) {
        return students.stream()
                .flatMap(Stream::ofNullable)
                .sorted(Comparator.comparingInt(Student::getScore))
                .dropWhile(student -> student.getScore() < bound)
                .collect(Collectors.toList());
    }
}
