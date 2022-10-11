package Gun34_15_09_22._02_Ornek;

public class Kopek extends Hayvan{
    public Kopek(String renk, int kilo, String cinsi) {
        super(renk, kilo, cinsi);
    }

    @Override
    public void konustu() {
        System.out.println("havladı");
    }
}
