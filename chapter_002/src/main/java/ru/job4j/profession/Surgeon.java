package ru.job4j.profession;

import java.time.LocalDate;

public class Surgeon extends Doctor {

    public Surgeon(String name, String surname, String education, LocalDate birthday, String specialisation, int experience) {
        super(name, surname, education, birthday, specialisation, experience);
    }

    public void operation(Patient patient) { }
}