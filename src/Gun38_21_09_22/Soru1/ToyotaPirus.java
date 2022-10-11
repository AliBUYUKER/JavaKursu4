package Gun38_21_09_22.Soru1;

public class ToyotaPirus extends Vehicle implements IVehicle,IElectric,IGas{
    public ToyotaPirus(String model, int engine) {
        super(model, engine);
    }

    @Override
    public String changeBattery() {
        return null;
    }

    @Override
    public String changeOil() {
        return null;
    }

    @Override
    public String drive() {
        return null;
    }
}
