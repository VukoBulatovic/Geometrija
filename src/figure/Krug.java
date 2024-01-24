package figure;

public class Krug extends Elipsa {

    @Override
    public String getIme() {
        return "Krug";
    }

    @Override
    public double obim() {
        return 2 * Math.PI * getA();
    }

    public Krug(double r) {
        super(r, r);

    }
}
