package Gun40_23_09_22._01_Ornek;

public class Kartal extends Hayvan{
    public Kartal( String name, boolean vahsi, String dateBrithday) {
        super(name, vahsi, dateBrithday);
    }

    @Override
    void food() {

    }

    @Override
    void food(Hayvan hayvan) {
        System.out.println("Eagle eats mouse");
    }

    @Override
    void amountOfFood(Hayvan hayvan) {
        System.out.println("5-6 kg Meat");
    }

    @Override
    void sleepingTimeForDay(Hayvan hayvan) {
        System.out.println("7-8 hours for day");
    }

    @Override
    void sound(Hayvan hayvan) {
        System.out.println("Ciyak ciyak");
    }


}
