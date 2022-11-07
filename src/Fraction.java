public class Fraction{
    public int numetator;
    public int denominator;
    public double decFraction = toDec();
    protected double summ = 0;
    protected double multy = 1;

    Fraction(int numetator, int denominator){
        this.numetator = numetator;
        this.denominator = denominator;
    }
    Fraction(Double decFraction){
        this.decFraction = decFraction;

    }
    double toDec(){
            return (double) numetator / denominator;
    }

    public void sum(int numetator, int denominator){
        this.summ += (double) numetator / denominator;

    }

    public void mult(int numetator, int denominator){
        this.multy *= (double) numetator / denominator;

    }
}
