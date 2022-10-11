package Gun38_21_09_22.Soru1;

public class TeslaCar extends Vehicle implements IVehicle,IElectric{
    public TeslaCar(String model, int engine) {
        super(model, engine);
    }

    @Override
    public String drive() {
        return null;
    }

    @Override
    public String changeBattery() {
        return null;
    }
}
