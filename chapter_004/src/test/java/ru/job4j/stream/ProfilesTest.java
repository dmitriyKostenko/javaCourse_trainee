package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProfilesTest {
    @Test
    public void whenAddProfilesThenGetAddresses() {
        Address first = new Address("Taganrog", "Lenina", 38, 6);
        Address second = new Address("Rostov", "Sadovoya", 112, 36);
        Address third = new Address("Krasnodar", "Krasnaya", 67, 12);
        List<Address> expected = List.of(first, second, third);
        List<Profile> profiles = List.of(
                new Profile(first),
                new Profile(second),
                new Profile(third)
        );
        List<Address> result = new Profiles().collect(profiles);
        assertThat(result.toString(), is(expected.toString()));
    }
}
