package main.java.ru.yandex.theather;

public class Person {
    protected String name;
    protected String surname; // Фамилия.
    protected Gender gender;

    public Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }
}
