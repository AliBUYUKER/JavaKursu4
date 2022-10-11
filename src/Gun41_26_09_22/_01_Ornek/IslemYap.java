package Gun41_26_09_22._01_Ornek;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class IslemYap {
public static void  IslemYap() throws InterruptedException {
    List<IFood> orderList=new ArrayList<>();
    AdanaKebap a=new AdanaKebap();
    Lahmacun l=new Lahmacun();
    Brosh b=new Brosh();
    Palov p=new Palov();
    LocalDateTime t=LocalDateTime.now();
    Scanner input=new Scanner(System.in);
    int choice=0;
    do {double hesap=0;
    System.out.print("1-Adana Kebap "+a.fee() +"₺\n"+
            "2-Lahmacun "+l.fee()+"₺\n" +
            "3-Borsh "+b.fee() +"₺\n" +
            "4-Pilav "+ p.fee()+"₺\n" +
            "5-Siparişleriniz \n"+
            "0-Tamam\n" +
            "Seçiminiz =");
  choice= input.nextInt();
    switch (choice){
        case 1:orderList.add(a);break;
        case 2:orderList.add(l);break;
        case 3:orderList.add(b);break;
        case 4:orderList.add(p);break;
        case 5:for (IFood list:orderList){
            list.name();
            System.out.println(list.fee()+"₺");
            System.out.println("----");
            hesap=hesap+list.fee();
        }
        case 0:
            System.out.println("Sipariş hazırlanıyor\nLütfen Bekleyiniz. :)");break;
        default:
            System.out.println("Yanlış seçim");break;
    }}while (!(choice==0));

    for (IFood food:orderList){
siparisHazirlama(food);
    }

    double hesap=0;
    System.out.print("Siparişleriniz \n");
    for (IFood list:orderList){
        list.name();
        System.out.println(list.fee()+"₺");
        System.out.println("----");
        hesap=hesap+list.fee();
    }DateTimeFormatter tt=DateTimeFormatter.ofPattern(" kk:mm:ss");
    System.out.print(t.getDayOfMonth()+"-"+t.getMonthValue()+"-"+t.getYear());
    System.out.println(t.format(tt));
    System.out.println("Hesap ="+hesap+"₺\n"
    +"Afiyet olsun\n"+
            "Yine Bekleriz :)");

}
public static void siparisHazirlama(IFood food) throws InterruptedException {
LocalTime t=LocalTime.now();
int a=450;
    DateTimeFormatter tt=DateTimeFormatter.ofPattern("kk:mm:ss");
    if (food instanceof AdanaKebap){
        System.out.println("Adana kebap Hazırlanıyor");
        System.out.println(t.format(tt));
        Thread.sleep(a);
        System.out.print(".");Thread.sleep(a);
        System.out.print(".");Thread.sleep(a);
        System.out.println(".");Thread.sleep(a);
        ((AdanaKebap)food).marinade();
        Thread.sleep(a);
        System.out.print(".");Thread.sleep(a);
        System.out.print(".");Thread.sleep(a);
        System.out.println(".");Thread.sleep(a);
        ((AdanaKebap)food).grill();
        Thread.sleep(a);
        System.out.print(".");Thread.sleep(a);
        System.out.print(".");Thread.sleep(a);
        System.out.println(".");Thread.sleep(a);
        ((AdanaKebap)food).taste();
        System.out.println("******************");
    }if (food instanceof Lahmacun){
        System.out.println("Lahmacun hazırlanıyor");
        System.out.println(t.format(tt));
        System.out.print(".");Thread.sleep(a);
        System.out.print(".");Thread.sleep(a);
        System.out.println(".");Thread.sleep(a);
        ((Lahmacun)food).dough();
        Thread.sleep(a);
        System.out.print(".");Thread.sleep(a);
        System.out.print(".");Thread.sleep(a);
        System.out.println(".");Thread.sleep(a);
        ((Lahmacun)food).addMeat();
        Thread.sleep(a);
        System.out.print(".");Thread.sleep(a);
        System.out.print(".");Thread.sleep(a);
        System.out.println(".");Thread.sleep(a);
        ((Lahmacun)food).bake();
        Thread.sleep(a);
        System.out.print(".");Thread.sleep(a);
        System.out.print(".");Thread.sleep(a);
        System.out.println(".");Thread.sleep(a);
        ((Lahmacun)food).taste();
        System.out.println("******************");
    }
    if (food instanceof Brosh){
        System.out.println("Brosh çorbası hazırlanıyor");
        System.out.println(t.format(tt));
        System.out.print(".");Thread.sleep(a);
        System.out.print(".");Thread.sleep(a);
        System.out.println(".");Thread.sleep(a);
        ((Brosh)food).boil();
        Thread.sleep(a);
        System.out.print(".");Thread.sleep(a);
        System.out.print(".");Thread.sleep(a);
        System.out.println(".");Thread.sleep(a);
        ((Brosh)food).service();
        Thread.sleep(a);
        System.out.print(".");Thread.sleep(a);
        System.out.print(".");Thread.sleep(a);
        System.out.println(".");Thread.sleep(a);
        ((Brosh)food).taste();
        Thread.sleep(a);
        System.out.print(".");Thread.sleep(a);
        System.out.print(".");Thread.sleep(a);
        System.out.println(".");Thread.sleep(a);
        System.out.println("******************");
    }if (food instanceof Palov){
        System.out.println("Pilav hazırlanıyor");
        System.out.println(t.format(tt));
        System.out.print(".");Thread.sleep(a);
        System.out.print(".");Thread.sleep(a);
        System.out.println(".");Thread.sleep(a);
        ((Palov)food).fry();
        System.out.print(".");Thread.sleep(a);
        System.out.print(".");Thread.sleep(a);
        System.out.println(".");Thread.sleep(a);
        ((Palov)food).boil();
        System.out.print(".");Thread.sleep(a);
        System.out.print(".");Thread.sleep(a);
        System.out.println(".");Thread.sleep(a);
        ((Palov)food).taste();
    }



}

}
