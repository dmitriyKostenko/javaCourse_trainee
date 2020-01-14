package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        String unknown = "Неизвестное слово. ";
        return unknown + eng;
    }

    public static void main(String[] args) {
        DummyDic dic = new DummyDic();
        String phrase = dic.engToRus("синхрофазотрон");
        System.out.println(phrase);
    }
}