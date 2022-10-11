package Gun36_19_09_22._04__03_Poly_Soru;

public class Main {
    public static void main(String[] args) {
        Human w=new Human("Ali","Büyüker","Worker");
        w.IdentityCard();
        Student s=new Student("Ali","Büyüker","Student");
        s.IdentityCard();
        Id(w);
        Id(s);
    }
    public static void Id(Human h){
        h.IdentityCard();
    }
}
