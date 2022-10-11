package Gun30_09_09_22.Soru;

public class Musteri {
   private int hesapId;
   String name;
   String surName;

    @Override
    public String toString() {
        return "Musteri " +
                "Hesap Id=" + hesapId +
                ", İsim ='" + name +" "+surName + '\'' ;
    }

    Hesap MusteriHesap;


   public void hesapidBelirleme(){
       hesapId= (int) (Math.random()*1000000);
       System.out.println("Hesap Id Atandı = " + hesapId);
   }

}
