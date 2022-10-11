package Gun35_16_09_22._02_Ornek;

public class Sekil {

    public double alanHesabi(){
        return 0;
    }
    public double cevreHesabi(){
        return 0;
    }

    public String toStrging(){
        return "Alan = "+alanHesabi()+" Çevre = "+cevreHesabi();
    }

    public static void main(String[] args) {
        Daire d=new Daire(5);
        System.out.println("Alan = "+d.alanHesabi()+" "+"Çevre = "+ d.cevreHesabi());
        Dikdortgen dd=new Dikdortgen(5,7);
        System.out.println("Alan = "+dd.alanHesabi()+" Çevre = "+ dd.cevreHesabi());
        Kare k=new Kare(5);
        System.out.println("Alan = "+k.alanHesabi()+" Çevre = "+k.cevreHesabi());


    }


}
