package ru.job4j.profession;

import java.time.LocalDate;

public class Builder extends Engineer {
    private int experience;

    public Builder(String name, String surname, String education, LocalDate birthday, int experience) {
        super(name, surname, education, birthday);
        this.experience = experience;
    }

    public House build(House house) {
        return null;
    }
}
