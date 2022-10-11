package Gun36_19_09_22._02_Final.methodFinal;

public class Vehicle {
    private String cinsi;
    public Vehicle(String cinsi){
        this.cinsi=cinsi;
    }
    public String getCinsi(){
        return cinsi;
    }
    public void setCinsi(String cinsi){
        this.cinsi=cinsi;
    }
    public final void VasitaOzelYazdir(){
        System.out.println("Özel yazdırma metodu");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "cinsi='" + cinsi + '\'' +
                '}';
    }
}
