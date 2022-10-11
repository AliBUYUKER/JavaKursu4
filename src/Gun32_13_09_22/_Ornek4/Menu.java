package Gun32_13_09_22._Ornek4;

import java.util.Scanner;

public class Menu {enum pizzaBoyu{
    Small(1,"Small"),Medium(2,"Medium"),
    Large(3,"Large"),XXL(4,"XXL");
    int no;
    String ad;

    pizzaBoyu(int no, String ad) {
        this.no = no;
        this.ad = ad;
    }
}


enum pizzaCesidi{
    Konyalim(1,"Konyalım"),Bolmalzemos(2,"Bolmalzemos"),
    TonBalikli(3,"Tonbalıklı"),BolSucuklu(4,"Bol sucuklu"),
    Peynirli(5,"Peynirli");

    pizzaCesidi(int cesitNo, String cesitAd) {
        this.cesitNo = cesitNo;
        this.cesitAd = cesitAd;
    }

    int cesitNo;
    String cesitAd;
}
public static void secimler(){
    Scanner input=new Scanner(System.in);
    System.out.println("1-"+pizzaCesidi.Konyalim+
            "2-"+pizzaCesidi.Bolmalzemos+
            "3-"+pizzaCesidi.TonBalikli+
            "4-"+pizzaCesidi.BolSucuklu+
            "5-"+pizzaCesidi.Peynirli);
    int secim= input.nextInt();
    switch (secim){

    }
}
}
