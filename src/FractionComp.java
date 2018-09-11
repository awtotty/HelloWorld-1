import java.util.Comparator;

public class FractionComp implements Comparator<Fraction> {


    @Override
    public int compare(Fraction o1, Fraction o2) {
        return o1.getN() - o2.getN();
    }
}
