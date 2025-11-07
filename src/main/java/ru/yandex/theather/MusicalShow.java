package main.java.ru.yandex.theather;

import java.util.ArrayList;

public class MusicalShow extends Show {
    protected String musicAuthor;
    protected String librettoText;

    public MusicalShow(String title, int duration, Person director, ArrayList<Actor> listOfActors, String musicAuthor,
                       String librettoText) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibretto() {
        System.out.println();
        System.out.println("Либретто: Спектакль '" + title + "' " + librettoText + ".");
    }
}
