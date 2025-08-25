package Bai2;

public class ClothingProduct extends Product {

    public ClothingProduct(String id, String name, double price, int quantity, String category, Manufacturer manufacturer) {
        super(id, name, price, quantity, category, manufacturer);
    }

    @Override
    public double getDiscountPrice() {
        return getPrice() - (getPrice() * ((double) 20 / 100));
    }
}
