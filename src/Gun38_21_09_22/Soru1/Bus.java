package Gun38_21_09_22.Soru1;

public class Bus extends Vehicle implements IDeisel,IVehicle{
    public Bus(String model, int engine) {
        super(model, engine);
    }

    @Override
    public String changeDiesel() {
        return null;
    }

    @Override
    public String drive() {
        return null;
    }
}
