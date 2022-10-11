package Gun36_19_09_22._03_Ornek;

public class Kedi extends Hayvan{
    public Kedi(String name) {
        super(name);
    }

    @Override
    public void ses() {
        System.out.println("miyavladı");
    }
    public void tirmaladi(){
        System.out.println("tırmaladı");
    }
}
