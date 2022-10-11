package Gun36_19_09_22._01_Protected.Paket2;

import Gun36_19_09_22._01_Protected.Paket1.Hayvan;

public class P2Main {
    public static void main(String[] args) {
        Hayvan h=new Hayvan();
        h.ad="karabaş";
        Hayvan2 h1=new Hayvan2("kopuk","scotish");
        System.out.println(h1);
    }

}
