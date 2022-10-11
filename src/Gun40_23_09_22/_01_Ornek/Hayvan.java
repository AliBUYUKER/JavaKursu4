package Gun40_23_09_22._01_Ornek;

import java.time.LocalDate;

public abstract class Hayvan {
   final int id;
    private String name;
    private boolean vahsi;
    private String dateBrithday;

    static int sayac=0;

    abstract void food();

    abstract void food(Hayvan hayvan);
    abstract void amountOfFood(Hayvan hayvan);
    abstract void sleepingTimeForDay(Hayvan hayvan);
    abstract void sound(Hayvan hayvan);

    public Hayvan(String name, boolean vahsi, String dateBrithday) {
        this.id = ++sayac;
        setName(name);
        setVahsi(vahsi);
        setDateBrithday(dateBrithday);
    }
    public int age(String dateBrithday){
        int date=Integer.parseInt(dateBrithday);
        date= LocalDate.now().getYear()-date;
        return date;
    }

    public void again(Hayvan hayvan){
        hayvan.food(hayvan);
        hayvan.sleepingTimeForDay(hayvan);
        hayvan.amountOfFood(hayvan);
        hayvan.sound(hayvan);
    }

    @Override
    public String toString() {
        return "id = " + id +
                " name = " + name + '\'' +
                " vahsi = " + vahsi +"\n"+
                " dateBrithday = " + dateBrithday+" Yaş = "+age(dateBrithday)+"\n";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVahsi() {
        return vahsi;
    }

    public void setVahsi(boolean vahsi) {
        this.vahsi = vahsi;
    }

    public String getDateBrithday() {
        return dateBrithday;
    }

    public void setDateBrithday(String dateBrithday) {
        this.dateBrithday = dateBrithday;
    }
}
