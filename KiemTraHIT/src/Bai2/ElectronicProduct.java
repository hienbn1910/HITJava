package Bai2;

public class ElectronicProduct extends Product {

    public ElectronicProduct(String id, String name, double price, int quantity, String category, Manufacturer manufacturer) {
        super(id, name, price, quantity, category, manufacturer);
    }

    @Override
    public double getDiscountPrice() {
        return getPrice() - (getPrice() * ((double) 10 / 100));
    }
}
