public class Fraction implements Comparable<Fraction> {
    private int n, d;

    public Fraction(int n, int d) {
        this.n = n;
        this.d = d;
    }

    public int getN() {
        return n;
    }

    public int compareTo(Fraction other) {
        double diff = (double)this.n / this.d - (double)other.n / other.d;
        if (diff > 0)
            return (int) Math.ceil(diff);
        else
            return (int) Math.floor(diff);
    }

}
