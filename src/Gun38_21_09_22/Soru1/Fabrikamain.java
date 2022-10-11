package Gun38_21_09_22.Soru1;

import java.util.ArrayList;

public class Fabrikamain {

    public static void main(String[] args) {
        ArrayList<Vehicle> arabalar=new ArrayList<>();
Bus b=new Bus("Iveco",7000);
TeslaCar t=new TeslaCar("ModelS",310);
ToyotaPirus p=new ToyotaPirus("Pirus",210);
arabalar.add(b);
arabalar.add(t);
arabalar.add(p);

for (Vehicle v:arabalar){
    System.out.println("--------------------------");
    System.out.println(v.getClass().getSimpleName());


    System.out.println("Model = " + v.get_model());
    System.out.println("Engine = " + v.get_engine());
    if (v instanceof TeslaCar){
        System.out.println(((TeslaCar)v).drive());
        System.out.println(((TeslaCar)v).changeBattery());
    }if (v instanceof ToyotaPirus){
        System.out.println(((ToyotaPirus)v).drive());
        System.out.println(((ToyotaPirus)v).changeBattery());
        System.out.println(((ToyotaPirus)v).changeOil());
    }if (v instanceof Bus){
        System.out.println(((Bus)v).drive());
        System.out.println(((Bus)v).changeDiesel());
    }
}


    }
}
