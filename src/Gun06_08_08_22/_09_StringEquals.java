package Gun06_08_08_22;

public class _09_StringEquals {
    public static void main(String[] args) {
        // eqals : 2 stringin birbirine eşit olup olmadığını kontrol eder
        // sonuç boolean
        String s1="Merhaba";
        String s2="MERHABA";
        String s3="Merhaba";
        boolean Esit=s1.equals(s2); //s1 s2'ye eşit mi?
        System.out.println("Esit = " + Esit);

        System.out.println("s1.eqals(s2) = " + s1.equals(s2));
        System.out.println("s1 = " + s1.equals(s3));




    }
}
