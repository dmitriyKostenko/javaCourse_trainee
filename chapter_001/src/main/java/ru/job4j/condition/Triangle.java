package ru.job4j.condition;

import static java.lang.Math.sqrt;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    public double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    public double area() {
        double rsl = -1;
        double a = first.distance(second);
        double b = second.distance(third);
        double c = first.distance(third);
        double p = period(a, b, c);
        if (this.exist(a, b, c)) {
            rsl = sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return rsl;
    }

    private boolean exist(double a, double c, double b) {
        return a + b > c && b + c > a && c + a > b;
    }
}
