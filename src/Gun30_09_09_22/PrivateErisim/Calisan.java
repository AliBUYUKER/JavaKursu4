package Gun30_09_09_22.PrivateErisim;

public class Calisan {
    int id;
    String name;
    String surName;
   private String password;
   public void sifreAta(String sifre){
       if (sifre.length()>=8){
       this.password=sifre;
           System.out.printf("Şifre atandı");
       }else System.out.println("Şifre kurala uygun değil");
   }
   public String sifreGoster(){
       return "*****"+password.substring(5);
   }

}
