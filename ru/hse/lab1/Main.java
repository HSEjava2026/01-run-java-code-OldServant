package ru.hse.lab1;
/**
 * @author — lol
 * @version — 1.0
 * @since — 2026
 */
import ru.hse.lab1.second.Person;

public class Main {
    public static void main(String[] args) {
        Person ivan = new Person(16, "ivan");

        System.out.print(ivan.getAge());
    }
}