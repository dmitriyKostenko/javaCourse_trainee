package ru.job4j.search;

import org.junit.Test;
import ru.job4j.search.Person;
import ru.job4j.search.PhoneDictionary;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk"));
        ArrayList<Person> persons = phones.find("Pet");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }

    @Test
    public void whenFindByPartSurname() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk"));
        ArrayList<Person> persons = phones.find("sent");
        assertThat(persons.get(0).getName(), is("Petr"));
    }

    @Test
    public void whenFindByPartPhone() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk"));
        ArrayList<Person> persons = phones.find("487");
        assertThat(persons.get(0).getAddress(), is("Bryansk"));
    }
}
