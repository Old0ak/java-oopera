package main.java.ru.yandex.theather;

import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {
        Actor konstantinHabenskiy = new Actor("Константин", "Хабенский", Gender.MALE, 1.72);
        Actor danilaKozlovskiy = new Actor("Данила", "Козловский", Gender.MALE, 1.84);
        Actor lubovAksenova = new Actor("Лобовь", "Аксёнова", Gender.FEMALE, 1.75);

        Director kirillSerebrennikov = new Director("Кирилл", "Серебренников", Gender.MALE,
                55);
        Director elizavetaBondar = new Director("Елизавета", "Бондарь", Gender.FEMALE, 16);

        Person hansZimmer = new Person("Ханс", "Циммер", Gender.MALE);
        Person allaDuhova = new Person("Алла", "Духова", Gender.FEMALE);

        ArrayList<Actor> listOfActorsByRomeoAndJuliet = new ArrayList<>();
        ArrayList<Actor> listOfActorsByKarmen = new ArrayList<>();
        ArrayList<Actor> listOfActorsByLebedinoeOzero = new ArrayList<>();

        Show romeoAndJuliet = new Show("Ромео и Джульетта", 145, kirillSerebrennikov,
                listOfActorsByRomeoAndJuliet);
        Opera karmen = new Opera("Кармен", 190, elizavetaBondar, listOfActorsByKarmen, hansZimmer,
                "повествует о трагической любви солдата Хозе к свободолюбивой цыганке Кармен", 10);
        Ballet lebedinoeOzero = new Ballet("Лебединое озеро", 180, kirillSerebrennikov,
                listOfActorsByLebedinoeOzero, allaDuhova, "рассказывает о принце Зигфриде, " +
                "который влюбляется в Одетту — принцессу, заколдованную злым колдуном фон Ротбартом", allaDuhova);

        romeoAndJuliet.addNewActor(konstantinHabenskiy);
        romeoAndJuliet.addNewActor(lubovAksenova);
        System.out.println();
        karmen.addNewActor(lubovAksenova);
        karmen.addNewActor(danilaKozlovskiy);
        System.out.println();
        lebedinoeOzero.addNewActor(konstantinHabenskiy);
        lebedinoeOzero.addNewActor(lubovAksenova);
        lebedinoeOzero.addNewActor(danilaKozlovskiy);

        romeoAndJuliet.printActors();
        karmen.printActors();
        lebedinoeOzero.printActors();

        romeoAndJuliet.replaceActor(danilaKozlovskiy, konstantinHabenskiy.surname);
        romeoAndJuliet.printActors();

        karmen.replaceActor(danilaKozlovskiy, "Петров");

        karmen.printLibretto();
        lebedinoeOzero.printLibretto();
    }
}
