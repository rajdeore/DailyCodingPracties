package Interview.Old.Accolite.L3;

public class demo implements SimpleInterest{
    @Override
    public double simpleInterest(int p, int r, int t) {
        return ( p * r * t) / 100;
    }
}
