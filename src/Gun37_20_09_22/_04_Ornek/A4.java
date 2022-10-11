package Gun37_20_09_22._04_Ornek;

public class A4 implements IGosterir,IYazdirir{
    @Override
    public void goster() {
        System.out.println("gosterdi");
    }

    @Override
    public void yazdir() {
        System.out.println("yazdırdı");
    }
    // hem karasal hem uydu

}
