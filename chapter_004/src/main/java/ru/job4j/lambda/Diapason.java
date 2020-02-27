package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Diapason {
    public List<Double> diapason(int start, int finish, Function<Double, Double> func) {
        List<Double> function = new ArrayList<>();
        for (int index = start; index != finish; index++) {
            function.add(func.apply((double) index));
        }
        return function;
    }
}
