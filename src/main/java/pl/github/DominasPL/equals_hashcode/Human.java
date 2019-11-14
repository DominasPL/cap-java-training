package pl.github.DominasPL.equals_hashcode;

import java.util.Objects;

public class Human {

    private String firstName;
    private String lastName;
    private String PESEL;

    public Human(String firstName, String lastName, String PESEL) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.PESEL = PESEL;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(firstName, human.firstName) &&
                Objects.equals(lastName, human.lastName) &&
                Objects.equals(PESEL, human.PESEL);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, PESEL);
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", PESEL='" + PESEL + '\'' +
                '}';
    }
}
