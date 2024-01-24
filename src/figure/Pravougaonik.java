package figure;

public class Pravougaonik extends Paralelogram {

    public Pravougaonik(double a, double b) {
        super(a, b);
    }

    @Override
    public double povrsina() {
        return getA() * getB();
    }

    @Override
    public String getIme() {
        return "Pravougaonik";
    }
}
