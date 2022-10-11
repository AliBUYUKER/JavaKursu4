package Gun36_19_09_22._03_Ornek;

public class Kopek extends Hayvan{
    public Kopek(String name) {
        super(name);
    }

    @Override
    public void ses() {
        System.out.println("havladı");
    }
    public void kokladi(){
        System.out.println("kokladı");
    }
}
