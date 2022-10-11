package Gun31_12_09_22._01_StaticModifier.Ornek2;

public class School {// Student (id, name, surName)
    // Yukarıdaki gibi 5 öğrenci tanımlayınız.
    // Her öğrencinin takip eden bir id si olmalı.(otomatik artan)
    // Ve en son kaç öğrenci olduğunu bulabilmeliyim.
    public static void main(String[] args) {
        Student ogr1=new Student("ali büyüker");
        Student ogr2=new Student("ismet temur");
        Student ogr3=new Student("burak yılmaz");
        System.out.println("ogr1 = " + ogr1);
        System.out.println("ogr1 = " + ogr2);
        System.out.println("ogr1 = " + ogr3);

    }
}
