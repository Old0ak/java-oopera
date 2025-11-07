public class Director extends Person{
    private int numberOfShows;

    public Director(String name, String surname, Gender gender, int numberOfShows) {
        super(name, surname, gender);
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.numberOfShows = numberOfShows;
    }

    @Override
    public String toString() {
        return "Director{" +
                "numberOfShows=" + numberOfShows +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + gender +
                '}';
    }
}
