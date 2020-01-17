package ru.job4j.profession;

import java.time.LocalDate;

public class Patient {
    private String name;
    private String surname;
    private LocalDate birthday;

    public Patient(String name, String surname, LocalDate birthday) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }
}
