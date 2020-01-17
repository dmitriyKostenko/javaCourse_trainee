package ru.job4j.profession;

import java.time.LocalDate;

public class Engineer extends Profession {

    public Engineer(String name, String surname, String education, LocalDate birthday) {
        super(name, surname, education, birthday);
    }

    public Architecture design() {
        return null;
    }
}
