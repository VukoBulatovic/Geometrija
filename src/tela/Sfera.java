package tela;

public class Sfera extends Elipsoid {

    public Sfera(double r) {
        super(r, r, r);
    }

    @Override
    public String getIme() {
        return "Sfera";
    }
}
