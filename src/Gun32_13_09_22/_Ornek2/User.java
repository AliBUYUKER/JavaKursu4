package Gun32_13_09_22._Ornek2;

public class User {
    String userName;
    Role role;

    @Override
    public String toString() {
        return
                 userName +  " "+
                 role +" "+
                 statu
                ;
    }

    public User(String userName, Role role, Statu statu) {
        this.userName = userName;
        this.role = role;
        this.statu = statu;
    }

    Statu statu;



}
