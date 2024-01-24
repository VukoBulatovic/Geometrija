package tela;

public class ObrtniElipsoid extends Elipsoid {

    public ObrtniElipsoid(double a, double b) {
        super(a, b, b);
    }

    @Override
    public String getIme() {
        return "Obrtni elipsoid";
    }
}
