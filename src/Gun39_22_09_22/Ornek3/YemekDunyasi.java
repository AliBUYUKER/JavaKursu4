package Gun39_22_09_22.Ornek3;

public class YemekDunyasi {
    public static void main(String[] args) {
        Baklava b=new Baklava();
        b.yaz("BAKLAVA");
        b.madeln();b.taste();
        System.out.println("******************");
       CheeseCake c=new CheeseCake();
       c.yaz("CHEESE CAKE");
       c.madeln();c.taste();
        System.out.println("******************");
        System.out.println("SALATALAR");
        GreekSalad g=new GreekSalad();
        g.yaz("GREEK SALAD");
        g.madeln();g.taste();
        System.out.println("******************");
        SezarSalad s=new SezarSalad();
        s.yaz("SEZAR SALAD");
        s.madeln();s.taste();



    }
}
