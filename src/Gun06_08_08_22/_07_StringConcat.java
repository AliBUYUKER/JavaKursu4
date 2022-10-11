package Gun06_08_08_22;

public class _07_StringConcat {
    public static void main(String[] args) {
        // cocat : bir stringi diğerine birleştiriyor.
        String s1="Merhaba";
        String s2="Dünya";
        System.out.println("birleşik hali= "+s1+s2);
        System.out.println("birleşik hali= "+s1.concat(s2));
        System.out.println("birleşik hali= "+s1.concat(" "+s2));
        System.out.println("birleşik hali= "+s1.concat(" ".concat(s2)));

        System.out.println("s2 = " + s2);
        System.out.println("s1 = " + s1);



    }
}
