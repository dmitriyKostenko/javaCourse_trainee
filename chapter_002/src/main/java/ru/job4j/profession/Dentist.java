package ru.job4j.profession;

import java.time.LocalDate;

public class Dentist extends Doctor {

    public Dentist(String name, String surname, String education, LocalDate birthday, String specialisation, int experience) {
        super(name, surname, education, birthday, specialisation, experience);
    }

    public void injection(Patient patient) { }
}
