package pl.github.DominasPL.interfaces;

public class Multiplication implements Computation {

    @Override
    public double compute(double arg1, double arg2) {
        return arg1 * arg2;
    }
}
