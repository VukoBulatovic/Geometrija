package tela;

import baza.Telo;

public abstract class Paralelopiped extends Telo {

    private double a;
    private double b;
    private double c;

    public Paralelopiped(double a, double b, double c) {
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
        return "paralelopiped";
    }
}
