package Bai2;

public class FoodProduct extends Product {

    public FoodProduct(String id, String name, double price, int quantity, String category, Manufacturer manufacturer) {
        super(id, name, price, quantity, category, manufacturer);
    }

    @Override
    public double getDiscountPrice() {
        return getPrice() - (getPrice() * ((double) 5 / 100));
    }
}
