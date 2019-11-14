package pl.github.DominasPL.inheritance;

public abstract class Fish extends Animal {

    @Override
    public String toString() {
        return super.toString() + "\nThis is abstract class Fish toString method!";
    }
}
