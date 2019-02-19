package Final;

import java.util.Date;



public class Ьфшт {
    public static void main(String[] args) {
        int x  = 14;
        x++;
        System.out.println(x);
        Human h =  new Human("Alexander", "Ignatiev", new Date (2003, 6, 18), "Belorusskaya 15");
    }
}
class OS{
    void Info(){
        System.out.println("It is OS");
    }
}
class Windows extends OS{
    @Override
    void Info(){
        System.out.println("It is Windows. It opens windows. :)");
    }
}
class Human{
    String name, soname, adress;
    final Date bd;
    final static String planet = "Earth";

    public Human(String name, String soname, Date bd, String adress) {
        this.name = name;
        this.soname = soname;
        this.adress = adress;
        this.bd = bd;
    }
}