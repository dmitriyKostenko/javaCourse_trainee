package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book comedy = new Book("Конституция", 64);
        Book criminal = new Book("Уголовный кодекс", 224);
        Book history = new Book("Остров сокровищ", 188);
        Book develop = new Book("Clean Code", 464);

        Book[] books = new Book[4];
        books[0] = comedy;
        books[1] = criminal;
        books[2] = history;
        books[3] = develop;

        for (int index = 0; index < books.length; index++) {
            Book b = books[index];
            System.out.println(b.getName() + ", стр. " + b.getPage());
        }

        Book[] temp = new Book[1];
        temp[0] = books[0];
        books[0] = books[3];
        books[3] = temp[0];

        System.out.println();
        System.out.println("Книжная полка после перестановки:");

        for (int index = 0; index < books.length; index++) {
            Book b = books[index];
            System.out.println(b.getName() + ", стр. " + b.getPage());
        }

        System.out.println();
        System.out.println("Книги с названием Clean Code:");

        for (int index = 0; index < books.length; index++) {
            Book b = books[index];
            if (b.getName().equals("Clean Code")) {
                System.out.println(b.getName() + ", стр. " + b.getPage());
            }
        }
    }
}
