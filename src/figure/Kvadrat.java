package figure;

public class Kvadrat extends Pravougaonik {

    public Kvadrat(double a) {
        super(a, a);
    }

    @Override
    public String getIme() {
        return "Kvadrat";
    }
}
