package Gun27_06_09_22.Gun27_06_09_22_03_Ornek;

import java.time.Year;

public class Person {
    String personName;
    String personSurname;
    int personAge;


    void bilgiYazdir(){
        System.out.println("personName = " + personName);
        System.out.println("personSurname = " + personSurname);
        System.out.println("personAge = " + personAge);
    }
    int getBirthYear(){
        return Year.now().getValue()-personAge;
    }
    String getInitials(){
        String donecek=personName.toUpperCase().charAt(0)+"."+personSurname.toUpperCase().charAt(0)+".";
        return donecek;
    }


}
