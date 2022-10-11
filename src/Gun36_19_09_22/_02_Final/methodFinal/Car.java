package Gun36_19_09_22._02_Final.methodFinal;

public class Car extends Vehicle {
private String renk;
    public Car(String cinsi,String renk) {
        super(cinsi);
        setRenk(renk);
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    @Override
    public String toString() {
        return "Car{" +
                "renk='" + renk + '\'' +
                '}';
    }

   /* public final void VasitaOzelYazdir(){
        System.out.println("Özel yazdırma metodu");
    }*/
    // final methodlar override edilemez ,
    // sadece direkt kullanılır

}
