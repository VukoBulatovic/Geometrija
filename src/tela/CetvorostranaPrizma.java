package tela;

public class CetvorostranaPrizma extends Paralelopiped {

    public CetvorostranaPrizma(double a, double b, double c) {
        super(a, b, c);
    }

    @Override
    public double povrsina() {
        return 2 * (getA() * getB() + getA() * getC() + getB() * getC());
    }

    @Override
    public double zapremina() {
        return getA() * getB() * getC();
    }

    @Override
    public String getIme() {
        return "Cetvorostrana prizma";
    }
}
