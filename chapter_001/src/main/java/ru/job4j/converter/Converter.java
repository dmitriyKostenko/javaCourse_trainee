package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int euroToRuble(int value) {
        return value * 70;
    }

    public static int dollarToRuble(int value) {
        return value * 60;
    }

    public static void main(String[] args) {
        /*int euro = rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");

        int dollar = rubleToDollar(180);
        System.out.println("180 rubles are " + dollar + " dollar.");

        int ruble_eur = euroToRuble(5);
        System.out.println("5 euros are " + ruble_eur + " rubles.");

        int ruble_dol = dollarToRuble(10);
        System.out.println("10 dollars are " + ruble_dol + " rubles.");*/

        int in_rubleToEuro = 140;
        int expected_euro = 2;
        int out_euro = rubleToEuro(in_rubleToEuro);
        boolean passed_rubleToEuro = expected_euro == out_euro;
        System.out.println("140 rubles are 2 euro. Test : " + passed_rubleToEuro);

        int in_rubleToDollar = 180;
        int expected_dollar = 3;
        int out_dollar = rubleToDollar(in_rubleToDollar);
        boolean passed_rubleToDollar = expected_dollar == out_dollar;
        System.out.println("180 rubles are 3 dollar. Test result : " + passed_rubleToDollar);

        int in_euroToRuble = 5;
        int expected_ruble_eur = 350;
        int out_ruble_eur = euroToRuble(in_euroToRuble);
        boolean passed_euroToRuble = expected_ruble_eur == out_ruble_eur;
        System.out.println("5 euros are 350 rubles. Test result : " + passed_euroToRuble);

        int in_dollarToRuble = 10;
        int expected_ruble_dol = 600;
        int out_ruble_dol = dollarToRuble(in_dollarToRuble);
        boolean passed_dollarToRuble = expected_ruble_dol == out_ruble_dol;
        System.out.println("10 dollars are 600 rubles. Test result : " + passed_dollarToRuble);
    }
}
