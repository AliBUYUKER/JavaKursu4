package Gun34_15_09_22._04_Ornek;

public class GenelMudur extends Calisan{
    private double tazminat;

    public GenelMudur(String isim, double maas, int maasKatsayisi,double tazminat) {
        super(isim, maas, maasKatsayisi);
        setTazminat(tazminat);
    }

    @Override
    public String toString() {
        return "GenelMudur{" +
                "isim = "+getIsim()+" Maaş = "+getMaas()+
                " Maaş Katsayısı = "+getMaasKatsayisi()+
                " tazminat = " + tazminat +

                '}';
    }
    public double yeniMaas(){
        return getMaas()*getMaasKatsayisi()+tazminat+getMaas();
    }

    @Override
    public double maasHesapla() {
        return super.maasHesapla()+tazminat;
    }

    public double getTazminat() {
        return tazminat;
    }

    public void setTazminat(double tazminat) {
        this.tazminat = tazminat;
    }

    @Override
    public String getIsim() {
        return super.getIsim();
    }

    @Override
    public void setIsim(String isim) {
        super.setIsim(isim);
    }


    @Override
    public double getMaas() {
        return super.getMaas();
    }

    @Override
    public void setMaas(double maas) {
        super.setMaas(maas);
    }
}
