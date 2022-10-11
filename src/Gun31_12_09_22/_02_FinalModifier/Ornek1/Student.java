package Gun31_12_09_22._02_FinalModifier.Ornek1;

public class Student {
   private final int okulNo;
    String tamAd;
    private static int sayac=1;


    @Override
    public String toString() {
        // okulNo=2; // private olsa da burada değiştirilebilir.
        return "Student{" +
                "okulNo=" + okulNo +
                ", tamAd='" + tamAd + '\'' +
                '}';
    }

    public Student(int okulNo, String tamAd) {
        this.okulNo = sayac++;
        this.tamAd = tamAd;
    }

}
