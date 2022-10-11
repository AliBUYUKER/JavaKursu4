package Gun31_12_09_22._02_FinalModifier.Ornek1;

import Gun31_12_09_22._01_StaticModifier.Ornek2.Student;

public class Okul {
    public static void main(String[] args) {
       Student ogr1=new Student("ali büyüker");
        Student ogr2=new Student("ismet temur");
        Student ogr3=new Student("burak yılmaz");
        System.out.println("ogr1 = " + ogr1);
        System.out.println("ogr1 = " + ogr2);
        System.out.println("ogr1 = " + ogr3);

        //ogr1.okulNo=2; // yapabiliyorum : int okulNo böyleyken

        //private : erişimi engeller ama class dan erişebilirim.
        //final : değerin BIRKEZ atandıktan sonra değiştirilmesini engeller.
        //final değişkenlere değer ne zaman atılabilir ?
        // ilk tanımlandığı zaman veya CONSTRUCTOR da.
    }
}
