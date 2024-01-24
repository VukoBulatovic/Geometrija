package tela;

import baza.Telo;

public class Elipsoid extends Telo {

    private double a;
    private double b;
    private double c;

    public Elipsoid(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String getIme() {
        return "Elipsoid";
    }

    @Override
    public double povrsina() {
        return 0;
    }

    @Override
    public double zapremina() {
        return (4.0 / 3.0) * Math.PI * a * b * c;
    }
}
