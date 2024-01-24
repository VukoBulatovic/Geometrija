import figure.Kvadrat;
import figure.Trougao;
import tela.Kocka;
import tela.ObrtniElipsoid;
import tela.Sfera;

public class Test {
    public static void main(String[] args) {

        Kvadrat kvadrat = new Kvadrat(5);
        System.out.println(kvadrat);

        System.out.println();

        Trougao trougao = new Trougao(3, 10, 3);
        System.out.println(trougao);

        System.out.println();

        Kocka kocka = new Kocka(4);
        System.out.println(kocka);

        System.out.println();

        Sfera sfera = new Sfera(3);
        System.out.println(sfera);

        System.out.println();

        ObrtniElipsoid obrtniElipsoid = new ObrtniElipsoid(4, 5);
        System.out.println(obrtniElipsoid);
    }

    }

