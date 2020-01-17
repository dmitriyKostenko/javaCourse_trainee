package ru.job4j.profession;

import java.time.LocalDate;

public class Programmer extends Engineer {
    private String level;

    public Programmer(String name, String surname, String education, LocalDate birthday, String level, int experience) {
        super(name, surname, education, birthday);
        this.level = level;
    }

    public Application writeCode(Application app) {
        return null;
    }
}
