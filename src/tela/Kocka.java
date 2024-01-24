package tela;

public class Kocka extends CetvorostranaPrizma {

    public Kocka(double a) {
        super(a, a, a);
    }

    @Override
    public String getIme() {
        return "Kocka";
    }
}
