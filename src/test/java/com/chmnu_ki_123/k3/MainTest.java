package com.chmnu_ki_123.k3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    public void testBook() {
        Book book = new Book("Захар Беркут", "Іван Франко", 1883);
        assertEquals("Книга: \"Захар Беркут\", Автор: Іван Франко, Рік видання: 1883", book.toString());
    }

    @Test
    public void testTextbook() {
        Textbook textbook = new Textbook("Алгебра", "Г. Шевченко", 2020, "Математика");
        assertEquals("Книга: \"Алгебра\", Автор: Г. Шевченко, Рік видання: 2020, Предмет: Математика", textbook.toString());
    }

    @Test
    public void testManual() {
        Manual manual = new Manual("Основи програмування", "О. Петренко", 2019, "Програмування");
        assertEquals("Книга: \"Основи програмування\", Автор: О. Петренко, Рік видання: 2019, Галузь: Програмування", manual.toString());
    }

    @Test
    public void testAnthology() {
        Anthology anthology = new Anthology("Збірник поезій", "Ліна Костенко", 2005, 150);
        assertEquals("Книга: \"Збірник поезій\", Автор: Ліна Костенко, Рік видання: 2005, Кількість творів: 150", anthology.toString());
    }
}
