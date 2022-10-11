package Gun32_13_09_22._Ornek1;

public class OrnekCozum {enum Aylar{
    Ocak, Subat, Mart, Nisan, Mayis, Haziran, Temmuz,
    Agustos, Eylul, Ekim, Kasim, Aralik
}

    public static void main(String[] args) {
    Aylar ay=Aylar.Agustos;
    // verilen ayın gün sayısı bulundu
        switch (ay){
            case Subat:
                System.out.println(28);break;
            case Ocak:
            case Mart:
            case Mayis:
            case Temmuz:
            case Agustos:
            case Ekim:
            case Aralik:
                System.out.println(31);break;
            case Nisan:
            case Eylul:
            case Kasim:
            case Haziran:
                System.out.println(30);break;
        }// bordro programında belli bir ay işlem yaptırma
        if (ay==Aylar.Mayis){
            System.out.println("Zam yapıldı");
        }
        // Aylar ay=Aylar.Mayis;
        System.out.println("ay = " + ay);
        System.out.println("ay.name() = " + ay.name());
        System.out.println("ay.ordinal() = " + ay.ordinal());
        for (Aylar a:Aylar.values())//Enum yapısındaki tüm bilgileri alabiliriz
            System.out.println(a.name()+" - "+a.ordinal());// indexi ve adı
    }
}
