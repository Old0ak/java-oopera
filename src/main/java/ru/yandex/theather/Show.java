package main.java.ru.yandex.theather;

import java.util.ArrayList;

public class Show {
    String title; // Название спектакля.
    int duration; // Длительность спектакля в минутах.
    String director;
    ArrayList<Actor> listOfActors;

    public Show(String title, int duration, String director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void addNewActor(Actor newActor) {
        if (listOfActors.contains(newActor)) {
            if (newActor.gender.equals(Gender.MALE)) {
                System.out.println("Такой актёр уже есть!");
            } else {
                System.out.println("Такая актриса уже есть!");
            }
        } else {
            listOfActors.add(newActor);
            if (newActor.gender.equals(Gender.MALE)) {
                System.out.println(newActor + " добавлен в спектакль: " + title + ".");
            } else {
                System.out.println(newActor + " добавлена в спектакль: " + title + ".");
            }
        }
    }

    public void replaceActor(Actor newActor, String surname) {
        for (Actor oldActor : listOfActors) {
            if (oldActor.surname.equals(surname)) {
                int index = listOfActors.indexOf(oldActor);
                System.out.println();
                System.out.print(oldActor + " успешно заменён на " + newActor);
                System.out.println();
                listOfActors.set(index, newActor);
                return;
            }
        }
        System.out.println();
        System.out.println("Актёр с фамилией " + surname + " в спектакле не участвует!");
    }

    public void printActors() {
        System.out.println();
        System.out.println("Спектакль: " + title + ".");
        for (Actor actor : listOfActors) {
            System.out.println(actor.toString());
        }
    }
}
