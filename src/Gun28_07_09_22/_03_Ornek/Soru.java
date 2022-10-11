package Gun28_07_09_22._03_Ornek;

import java.util.*;

public class Soru {
    // Bir Üniversitede öğrencilere ders kaydı yapılacaktır.
// 1- Lesson : fields : name, credit (1-10 arasında değer alıyor).
// 2- Student: fields : name, maxCredit, dersleri listesinin tutacak bir liste.
// 3- 3 adet ders oluşturunuz.
// 4- 1 adet öğrenci tanımlayınız alabileceği maxCredit si 10 olsun.
// 5- Bu öğrencinin ders listesine açılmış dersleri ekleyiniz.
//    ders eklerken max alabileceği Crediti geçmemeli, geçerse
//    uyarı versin, alabileceğiniz max credi doldu şeklinde.
// 6- Unıversıte kurallarını yazdıran 2 maddelik bir not yazdıran metod ekleyinız.
    public static void main(String[] args) {
        University.university();
        Scanner oku=new Scanner(System.in);
        Scanner sayiOku=new Scanner(System.in);
        ArrayList<String> alinanDers=new ArrayList<>();
        Map<String,Integer> dersler=new LinkedHashMap<>();
        System.out.println("        Verilecek Dersleri Belirleme");
        for (int i = 0; i < 5; i++) {
            Lesson ders1=new Lesson();
            System.out.print("Ders Adı =");
            ders1.name= oku.nextLine();
            System.out.print("Ders Kredisi =");
            ders1.credit=sayiOku.nextInt();
            dersler.put(ders1.name,ders1.credit);
            ders1.lessonAmount++;
        }

        Student ogr=new Student();
        ogr.fullName="Ali BÜYÜKER";
        int a=0;
        do {
            System.out.print("Ders seçiniz =");
            String secilen=oku.nextLine();
           ogr.maxCredit=(dersler.get(secilen)+ ogr.maxCredit);
            if (ogr.maxCredit>=20){
                System.out.println("Krediniz dolmuştur daha fazla seçemezsiniz");
                break;
            }else alinanDers.add(secilen);
            a++;

        }while (!(a==dersler.size()));




    }

}
