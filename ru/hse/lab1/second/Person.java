package ru.hse.lab1.second;
/**
 * @author — lol
 * @version — 1.0
 * @since — 2026
 */
public class Person {
    int age = 0;
    String name = "";

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public String getName() { return name; }
    public int getAge() { return age; }
}
