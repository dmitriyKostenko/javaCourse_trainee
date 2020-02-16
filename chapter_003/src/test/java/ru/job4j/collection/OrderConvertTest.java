package ru.job4j.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class OrderConvertTest {
    @Test
    public void whenSingleOrder() {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("s31b64sd3", "Dress"));
        HashMap<String, Order> map = OrderConvert.process(orders);
        assertThat(map.get("s31b64sd3"), is(new Order("s31b64sd3", "Dress")));
    }
}
