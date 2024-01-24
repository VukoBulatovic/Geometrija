package baza;

import interfejsi.MerljivoU3D;

public abstract class Telo extends Oblik implements MerljivoU3D {

    public Telo() {
    }

    @Override
    public String getOsobine() {
        StringBuilder sb = new StringBuilder();
        sb.append("Povrsina: ").append(povrsina()).append("\n");
        sb.append("Zapremina: ").append(zapremina());
        return sb.toString();
    }
}
