    package Gun03_03_08_22;

public class _02_JavaDataTypes {
    public static void main(String[] args) {

        int sayi; // butun tam sayılar kendi başlarınayken default INT görülür
        byte byteDeger=7; // -128, 127
        short shortDeger=1645;
        int IntDeger=25000;
        long longdDeger=232322223223L; // Default olarak tam sayıları INT kabul ettiğinden sonuna L koyarak LONG olduğunu belirttik
        // ondalıklı sayılar
        // default olarak butun ondalıklı sayıları DOUBLE kabul eder
        float floatDeger=3.140005F; // ondalıklı sayılar dafault olarak DOUBLE gorduğunden
                                    // Sonuna F ekleyerek Float olduğunu belirttik

        double doubleDeger= 3.1400000001;
        char basHarf='A'; // sayı ollarak saklıyor karakter tablosuna bakarak 65
        boolean evetMi=true; // sadece 2 değer alabilir true veya false


        System.out.println("byteDeger="+byteDeger);
        System.out.println("shortDeger = " + shortDeger);
        System.out.println("İntDeger = " + IntDeger);
        System.out.println("longdDeger = " + longdDeger);
        System.out.println("floatDeger = " + floatDeger);
        System.out.println("doubleDeger = " + doubleDeger);
        System.out.println("basHarf = " + basHarf);
        System.out.println("evetMi = " + evetMi);





    }
}
