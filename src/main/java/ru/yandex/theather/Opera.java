package main.java.ru.yandex.theather;

import java.util.ArrayList;

public class Opera extends MusicalShow {
    private int choirSize; // Количество человек в хоре.

    public Opera(String title, int duration, Person director, ArrayList<Actor> listOfActors, String musicAuthor,
                 String librettoText, int choirSize) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }
}
