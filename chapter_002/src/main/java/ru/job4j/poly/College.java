package ru.job4j.poly;

public class College {
    public static void main(String[] args) {
        Freshman freshman = new Freshman();
        // приведение к типу родителя Student.
        Student student = freshman;
        // приведение к типу родителя Object.
        Object obj = freshman;
    }
}
