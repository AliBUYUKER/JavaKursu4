package Gun40_23_09_22._01_Ornek;

public class Kedi extends Hayvan{
    public Kedi( String name, boolean vahsi, String dateBrithday) {
        super(name, vahsi, dateBrithday);
    }

    @Override
    void food() {

    }


    @Override
    void food(Hayvan hayvan) {
        System.out.println("Mama ve balık");
    }

    @Override
    void amountOfFood(Hayvan hayvan) {
        System.out.println("100 gr");
    }

    @Override
    void sleepingTimeForDay(Hayvan hayvan) {
        System.out.println("15 hours for day");
    }

    @Override
    void sound(Hayvan hayvan) {
        System.out.println("Miyav");
    }


}
