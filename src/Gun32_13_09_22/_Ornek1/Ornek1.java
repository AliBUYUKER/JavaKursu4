package Gun32_13_09_22._Ornek1;

public class Ornek1 {// Verilen bir ay noya göre sayısını veren programı yazınız

    public static void main(String[] args) {
        int no=5;
        switch (no){
            case 2:
                System.out.println(28);break;
            case 1:
            case 5:
            case 7:
            case 22:
            case 10:
            case 12:
                System.out.println(31);break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(30);break;
        }// okunabilirlik ve kontrollü yazılım yok, tanımlama yatersiz
        String ad="Mayıs";
        switch (ad){
            case "Şubat":
                System.out.println(28);break;
            case "Ocak":
            case "mart":
            case "nisan":
            case "agurtos":
            case "haziran":
            case "aralık":
                System.out.println(31);break;
            case "temuz":
            case "eyLul":
            case "EKİm":
            case "KASIM":
                System.out.println(30);break;
        }
        // USer ların ROL (yetkileri) leri vardır.
        // Campus  Student, Admin, Instructure

        // userSil();
//       if (user.Yetki == "GenelYetkili") // Role.Admin
//       {
//           userSil();
//       }
    }
}
