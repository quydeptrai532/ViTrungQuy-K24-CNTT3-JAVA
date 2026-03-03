package KT;

public class ElectronicProduct extends Product {
    protected int warrantyMonths;

    public ElectronicProduct(String id, String name, double price, int warrantyMonths) {
        super(id, name, price);
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    double caculateFinalPrice() {
        if(warrantyMonths>12) return price+=1000000;
        else return price;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("ID:"+id +"Ten:"+name+"Gia:"+price+"So thang bao hanh:"+warrantyMonths);
    }
}
