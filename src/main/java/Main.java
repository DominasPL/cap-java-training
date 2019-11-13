import pl.github.DominasPL.methods.Temperature;
import pl.github.DominasPL.objects.Dog;
import pl.github.DominasPL.objects.Owner;

public class Main {

    public static void main(String[] args) {

        //Exercise1
        System.out.println("Temperature is greater than 0: " + Temperature.checkIsPositive(-20.0));

        //Exercise2
        Owner owner = new Owner("Arkadiusz", "Gejsheimer");
        Dog dog = new Dog("Fafik", 20, owner);
        System.out.println(dog);

    }

}
