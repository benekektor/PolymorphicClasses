package com.chmnu_ki_123.k3;

class Book {
    private String title;
    private String author;
    private int publicationYear;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public String toString() {
        return "Книга: \"" + title + "\", Автор: " + author + ", Рік видання: " + publicationYear;
    }
}

class Textbook extends Book {
    private String subject;

    public Textbook(String title, String author, int publicationYear, String subject) {
        super(title, author, publicationYear);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return super.toString() + ", Предмет: " + subject;
    }
}

class Manual extends Book {
    private String field;

    public Manual(String title, String author, int publicationYear, String field) {
        super(title, author, publicationYear);
        this.field = field;
    }

    public String getField() {
        return field;
    }

    @Override
    public String toString() {
        return super.toString() + ", Галузь: " + field;
    }
}

class Anthology extends Book {
    private int numberOfWorks;

    public Anthology(String title, String author, int publicationYear, int numberOfWorks) {
        super(title, author, publicationYear);
        this.numberOfWorks = numberOfWorks;
    }

    public int getNumberOfWorks() {
        return numberOfWorks;
    }

    @Override
    public String toString() {
        return super.toString() + ", Кількість творів: " + numberOfWorks;
    }
}

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Захар Беркут", "Іван Франко", 1883);
        System.out.println(book);

        Textbook textbook = new Textbook("Алгебра", "Г. Шевченко", 2020, "Математика");
        System.out.println(textbook);

        Manual manual = new Manual("Основи програмування", "О. Петренко", 2019, "Програмування");
        System.out.println(manual);

        Anthology anthology = new Anthology("Збірник поезій", "Ліна Костенко", 2005, 150);
        System.out.println(anthology);
    }
}

