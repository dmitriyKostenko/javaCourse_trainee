package ru.job4j.profession;

import java.time.LocalDate;

public class Doctor extends Profession {
    private String specialisation;
    private int experience;

    public Doctor(String name, String surname, String education, LocalDate birthday, String specialisation, int experience) {
        super(name, surname, education, birthday);
        this.specialisation = specialisation;
        this.experience = experience;
    }

    public Diagnose overview(Patient patient) {
        return null;
    }

    public Diagnose heal(Patient patient) {
        return null;
    }
}
