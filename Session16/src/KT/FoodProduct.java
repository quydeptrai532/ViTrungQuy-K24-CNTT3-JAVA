package KT;

public class FoodProduct extends Product{
    protected int discountPercent;

    public FoodProduct(String id, String name, double price, int discountPercent) {
        super(id, name, price);
        this.discountPercent = discountPercent;
    }

    @Override
    double caculateFinalPrice() {
        return price-(price*discountPercent/100);
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("ID:"+id +"Ten:"+name+"Gia:"+price+"Phan tram giam gia:"+discountPercent);
    }
}
