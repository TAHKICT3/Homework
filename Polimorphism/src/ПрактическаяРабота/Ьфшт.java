package ПрактическаяРабота;

public class Ьфшт {
    public static void main(String[] args) {
        Phone[] Phones = new Phone[4];
        Phones[0] = new Nokia();
        Phones[1] = ((Nokia) Phones[0]).Create("1100", 72901852, "silver");
        Phones[3] = new Xiaomi();
        boolean b = Phones[2] instanceof Xiaomi;
        if (b) {
            Phones[2] = Phones[1].Create(Phones[3]);
        }
        else{
            Phones[2] = Phones[1].Create(Phones[1]);
        }
        for (Phone p : Phones){
            p.Info();
        }
        System.out.println("Control phones.");
        Nokia n = new Nokia();
        Xiaomi x = new Xiaomi();
        n.Info();
        x.Info();
    }
}
class Phone{
    String model, color;
    int number;
    public Phone Create(Object n){
        return (Nokia) n;
    }
    public void Info(){
        System.out.println("Model: "+ model + ", number: " + number + ", color: " + color + ".");
    }
}
class Nokia extends Phone{
    public Nokia(String model, int number, String color) {
        this.model = model;
        this.number = number;
        this.color = color;
    }
    public Nokia Create(){
        return new Nokia();
    }
    public Nokia Create(String model, int number, String color){
        return new Nokia(model, number, color);
    }

    public Nokia() {
        this.model = "2600";
        this.number = 5864655;
        this.color = "red";
    }
}
class Xiaomi extends Phone{
    String internettype;
    public Xiaomi (String model, int number, String color, String internettype) {
        this.model = model;
        this.number = number;
        this.color = color;
        this.internettype = internettype;
    }
    public Xiaomi Create(){
        return new Xiaomi();
    }

    public Xiaomi() {
        this.model = "Redmi 5 Pro";
        this.number = 78348919;
        this.color = "black";
        this.internettype = "4G";
    }
    @Override
    public void Info(){
        System.out.println("Model: "+ model + ", number: " + number + ", color: " + color + ", type of internet: " + internettype +".");
    }
}