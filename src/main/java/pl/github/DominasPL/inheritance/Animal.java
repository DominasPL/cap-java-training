package pl.github.DominasPL.inheritance;

public abstract class Animal {

    protected String name;
    protected int numberOfLegs;

    @Override
    public String toString() {
        return "This is Animal abstract class toString() method";
    }
}
