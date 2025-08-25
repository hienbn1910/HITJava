package Bai2;

import java.util.ArrayList;
import java.util.Comparator;

public class ProductServiceImpl implements ProductService {
    ArrayList<Product> products = new ArrayList<>();

    @Override
    public void addProduct(Product p) {

    }

    @Override
    public void updateProduct(String id, Product newInfo) {

    }

    @Override
    public void deleteProduct(String id) {
        for(Product p : products) {
            if(id.equalsIgnoreCase(p.getId())) {

            }
        }
    }

    @Override
    public Product findByName(String name) {
        for(Product p : products) {
            if(name.equalsIgnoreCase(p.getName())) {
                return p;
            }
        }
        return null;
    }

    @Override
    public void sortByPriceAsc() {
        products.sort(Comparator.comparingDouble(Product::getPrice));
    }

    @Override
    public void sortByPriceDesc() {
        products.sort(Comparator.comparingDouble(Product::getPrice).reversed());
    }

    @Override
    public void printProducts() {
        System.out.printf("%-6s %-20s %-5s %-25s %-10s %-15s %-6sn", "ID", "Name", "Category", "Manufactuer(Name)", "Quantity", "Price", "Discount Price");
        for(Product p : products) {
            p.toString();
        }
    }
    public void fakeData() {
        products.add(new ElectronicProduct("P001", "Iphone", 1000, 5, "Electronic", new Manufacturer("M001", "Apple", "USA", "apple@gmail.com")));
        products.add(new ElectronicProduct("P002", "SamSung S23 Ultra", 2000, 3, "Electronic", new Manufacturer("M002", "Apple", "USA", "samsung@gmail.com")));
        products.add(new ElectronicProduct("P003", "Bread", 100, 3, "Food", new Manufacturer("M003", "Jolibee", "USA", "jolibee@gmail.com")));
        products.add(new ElectronicProduct("P004", "Fatis", 3000, 5, "Clothing", new Manufacturer("M004", "Balenciaga", "USA", "balenciaga@gmail.com")));
        products.add(new ElectronicProduct("P005", "Coca", 30, 10, "Food", new Manufacturer("M005", "Cocacola", "USA", "cocacola@gmail.com")));
    }
}
