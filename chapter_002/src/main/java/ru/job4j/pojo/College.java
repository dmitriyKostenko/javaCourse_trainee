package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Баночкин Пётр Иванович");
        student.setGroup(35);
        student.setEntry(new Date());
        System.out.println("Студент " + student.getFio() + " группа № " + student.getGroup());
    }
}
