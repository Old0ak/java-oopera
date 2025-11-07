package main.java.ru.yandex.theather;

import java.util.Objects;

public class Actor extends Person {
    private double height;

    public Actor(String name, String surname, Gender gender, double height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public String toString() {
        String result;
        if (gender.equals(Gender.MALE)) {
            result = "[Актёр]";
        } else {
            result = "[Актриса]";
        }
        result += " Имя: " + name +
                ", Фамилия: " + surname +
                " (Рост: " + height +
                ')';
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Actor otherActor = (Actor) obj;
        return Objects.equals(name, otherActor.name) &&
                Objects.equals(surname, otherActor.surname) &&
                (height == otherActor.height);
    }

    @Override
    public int hashCode() {
        int hash = 17;
        if (name != null) {
            hash += name.hashCode();
        }
        hash *= 31;
        if (surname != null) {
            hash += surname.hashCode();
        }
        hash *= 31;
        hash += (int) height;
        return hash;
    }
}
