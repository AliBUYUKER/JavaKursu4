package Gun32_13_09_22._Ornek2;

public class Soru {
    // Bir User yetkilendirme modülü yapılması isteniyor.
    // USER ROLÜ : ADMIN, MUDUR, SATIS, PERSONEL
    // USER STATUSU : AKTIF, PASIF
    // Yukarıdaki şekilde bir USER class ı tanımlayınız
    // Farklı yetki ve statüde 2 kullanıcı ve bir de ADMIN
    // kullanıcısı tanımlayınız.
    // UserSilme isimli fonksiyona bu userları gönderiniz.
    // ADMIN kullanıcısı için bu user silinemez uyarısı verdirelim
    public static void main(String[] args) {
        User user1=new User("ali",Role.Mudur,Statu.Aktif);
        User user2=new User("ismet",Role.Admin,Statu.Aktif);
        User user3=new User("mehmet",Role.Satis,Statu.Pasif);

        userSil(user1);
        userSil(user2);
        userSil(user3);
        System.out.println("user1 = " + user1);
        System.out.println("user2 = " + user2);
        System.out.println("user3 = " + user3);

    }
    public static void userSil(User kullanici){
        if (kullanici.role==Role.Admin){
            System.out.println("Admin silinemez");
        }else {
            // bu bölümde silme işlemleri yapıldı
        }
    }
}
