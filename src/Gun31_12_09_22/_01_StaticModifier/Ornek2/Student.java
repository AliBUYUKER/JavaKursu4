package Gun31_12_09_22._01_StaticModifier.Ornek2;

public class Student {
    String fullName;
    int id;
    static int sayac=1;// sen bir tanesin
    // tüm nesnelere ait olan bilgileri veren
    //sayac gibi işlemler için static kullan
    public Student(String fullName) {
        this.fullName = fullName;
        this.id = sayac;
        sayac++;
    }
    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", id=" + id +
                '}';
    }




}
