package baza;

import interfejsi.MerljivoU2D;

public abstract class Figura extends Oblik implements MerljivoU2D {

    public Figura() {
    }

    @Override
    public String getOsobine() {
        StringBuilder sb = new StringBuilder();
        sb.append("Obim: ").append(obim()).append("\n");
        sb.append("Povrsina: ").append(povrsina());
        return sb.toString();
    }
}
