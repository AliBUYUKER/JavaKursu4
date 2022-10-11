package Gun36_19_09_22._01_Protected.Paket2;

import Gun36_19_09_22._01_Protected.Paket1.Hayvan;

public class Hayvan2 extends Hayvan {
    public Hayvan2(String ad,String cins){
        super.ad=ad;
        super.cins=cins;
    }

    @Override
    public String toString() {
        return "Hayvan2{" +
                "ad='" + ad + '\'' +
                ", cins='" + cins + '\'' +
                '}';
    }
}
