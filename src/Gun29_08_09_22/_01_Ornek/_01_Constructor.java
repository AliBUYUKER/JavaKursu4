package Gun29_08_09_22._01_Ornek;

public class _01_Constructor {
    public static void main(String[] args) {
        // 1.Yontem
        Student ogr1=new Student();// nesnenin oluşturulma anı
                                    // () bu  bir metod işareti


        //2.yontem
        Student ogr2=new Student(1,"Ali","Büyüker",12);
        System.out.println(ogr2.name);

        Student ogr3=new Student(3,"ismet","temur");
        System.out.println("ogr3.name = " + ogr3.name);
        Student ogr4=new Student(3,"Ali");
        System.out.println("ogr4 = " + ogr4.id);
    }
}
