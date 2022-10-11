package Gun38_21_09_22.Soru1;

public class Vehicle {
    private String _model;
    private int _engine;

    public Vehicle(String model, int engine) {
        this._model = model;
        this._engine = engine;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "_model='" + _model + '\'' +
                ", _engine='" + _engine + '\'' +
                '}';
    }

    public String get_model(){
        return _model;
    }
    public void set_model(String model){
        _model=model;
    }

    public int get_engine() {
        return _engine;
    }

    public void set_engine(int engine) {
        _engine = engine;
    }
}
