package Gun27_06_09_22.Gun27_06_09_22_04_Ornek;

public class  ElektrikHesabi {
    int totalconsumption;
    double unitPrice;
    double invoice;
    double tax1;
    double tax2;
    double tax3;
    double tax4;
    int firstIndex;
    int lastIndex;
    double totalIncoice;

void fatura(){
    totalconsumption=lastIndex-firstIndex;
    System.out.println("Kullanılan miktar"+"  "+"Ücret");
    invoice=totalconsumption*unitPrice;
    System.out.println(totalconsumption+"               "+invoice);
    System.out.println("Enerji Fonu ="+(invoice*tax1)/100);
    System.out.println("Trt Payı ="+(invoice*tax2)/100);
    System.out.println("Elektr, Ve HVG Tük.Ver. ="+(invoice*tax3)/100);
    System.out.println("KDV(%18) ="+(invoice*tax4)/100);
    totalIncoice=(((invoice*tax1)/100)+invoice)+(((invoice*tax2)/100))+((invoice*tax3)/100)+((invoice*tax4)/100);
    System.out.println("Total Amount Payable = " + totalIncoice+"₺");
}




}
