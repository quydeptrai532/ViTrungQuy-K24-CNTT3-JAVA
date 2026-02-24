package KT;

public abstract class Drink {
    protected String id;
    protected String name;
    protected double  price;

    public Drink(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    abstract double calculatePrice();
    void displayInfo(){
        System.out.println("Ten:" + this.name + "ID:" + this.id + "Gia:" +this.price);
    }
}
