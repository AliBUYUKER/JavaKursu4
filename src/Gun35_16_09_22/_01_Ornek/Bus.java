package Gun35_16_09_22._01_Ornek;

import Gun35_16_09_22._01_Ornek.Arac;

public class Bus extends Arac {
    int passengerCapacity;
    public Bus(String renk, int motorHacmi, String marka,int passengerCapacity) {
        super(renk, motorHacmi, marka);
        setPassengerCapacity(passengerCapacity);
    }


    @Override
    public String toString() {
        return "Bus/" +super.toString()+
                "/Passenger Capacity = " + passengerCapacity ;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }
}
