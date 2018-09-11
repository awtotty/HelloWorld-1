public class FractionMain {

    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 15);
        Fraction f2 = new Fraction(17, 15);

        System.out.println(f1.compareTo(f2));

        FractionComp fracComp = new FractionComp();
        System.out.println(fracComp.compare(f1,f2));
    }
}
