package KT;

public class Coffe  extends  Drink {
    private boolean hasMilk;

    public Coffe(String id, String name, double price, boolean hasMilk) {
        super(id, name, price);
        this.hasMilk = hasMilk;
    }
    @Override
    public double calculatePrice() {
        if (hasMilk) {
            return price + 5000;
        }
        return price;
    }
    @Override
    void displayInfo(){
        if(hasMilk){
            System.out.println("Ten: " + this.name + " ID: " + this.id + " Gia: " +this.price + " Co sua " );
        }
        else {
            System.out.println("Ten: " + this.name + " ID: " + this.id + " Gia: " +this.price + " Den da " );
        }

    }
}
