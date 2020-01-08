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

        int rubleEur = euroToRuble(5);
        System.out.println("5 euros are " + ruble_eur + " rubles.");

        int rubleDol = dollarToRuble(10);
        System.out.println("10 dollars are " + ruble_dol + " rubles.");*/

        int inRubleToEuro = 140;
        int expectedEuro = 2;
        int outEuro = rubleToEuro(inRubleToEuro);
        boolean passedRubleToEuro = expectedEuro == outEuro;
        System.out.println("140 rubles are 2 euro. Test : " + passedRubleToEuro);

        int inRubleToDollar = 180;
        int expectedDollar = 3;
        int outDollar = rubleToDollar(inRubleToDollar);
        boolean passedRubleToDollar = expectedDollar == outDollar;
        System.out.println("180 rubles are 3 dollar. Test result : " + passedRubleToDollar);

        int inEuroToRuble = 5;
        int expectedRubleEur = 350;
        int outRubleEur = euroToRuble(inEuroToRuble);
        boolean passedEuroToRuble = expectedRubleEur == outRubleEur;
        System.out.println("5 euros are 350 rubles. Test result : " + passedEuroToRuble);

        int inDollarToRuble = 10;
        int expectedRubleDol = 600;
        int outRubleDol = dollarToRuble(inDollarToRuble);
        boolean passedDollarToRuble = expectedRubleDol == outRubleDol;
        System.out.println("10 dollars are 600 rubles. Test result : " + passedDollarToRuble);
    }
}
