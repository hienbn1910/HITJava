//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cage cage1 = new Cage("Cage 1: ");
        cage1.addPet(new Pet("Tom", 15, "Dog"));
        cage1.addPet(new Pet("Bong", 5, "Cat"));
        cage1.addPet(new Pet("Poodle", 7, "Dog"));
        cage1.addPet(new Pet("Jerry", 11, "Mouse"));

        Cage cage2 = new Cage("Cage 2: ");
        cage2.addPet(new Pet("Alaska", 12, "Dog"));
        cage2.addPet(new Pet("Dogo", 5, "Cat"));
        cage2.addPet(new Pet("Bernese", 9, "Dog"));
        cage2.addPet(new Pet("Beauceron", 4, "Mouse"));

        System.out.print("Tổng số lồng đã tạo là: ");
        cage1.printTotalCages();
        System.out.println("Số pet trong từng lồng là: ");
        cage1.printAllPets();
        cage2.printAllPets();

        System.out.println();
        System.out.println("Các pet có nặng trên 10kg: ");
        cage1.printOverweight();
        cage2.printOverweight();
    }
}