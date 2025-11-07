package main.java.ru.yandex.theather;

import java.util.ArrayList;

public class Show {
    String title; // Название спектакля.
    int duration; // Длительность спектакля в минутах.
    Person director;
    ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Person director, ArrayList<Actor> listOfActors) {
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
        int numberOfIdenticalSurname = 0;
        Person foundActor = null;
        for (Actor oldActor : listOfActors) {
            if (oldActor.getSurname().equals(surname)) {
                numberOfIdenticalSurname++;
                foundActor = oldActor;
            }
        }
        if (numberOfIdenticalSurname == 1) {
            int index = listOfActors.indexOf(foundActor);
            System.out.println();
            System.out.print(foundActor + " успешно заменён на " + newActor);
            System.out.println();
            listOfActors.set(index, newActor);
        } else if (numberOfIdenticalSurname > 1) {
            System.out.println();
            System.out.println("Найдено несколько человек с фамилией " + surname + ".");
        } else {
            System.out.println();
            System.out.println("Актёр с фамилией " + surname + " в спектакле не участвует!");
        }
    }

    public void printActors() {
        System.out.println();
        System.out.println("Спектакль: " + title + ".");
        for (Actor actor : listOfActors) {
            System.out.println(actor.toString());
        }
    }
}
