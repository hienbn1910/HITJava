import java.util.ArrayList;

public class Cage {
    private String cageCode;
    private ArrayList<Pet> pets;
    private int currentPetCount;
    private static int totalCages;
    final int MAX_CAPACITY = 3;

    public Cage() {

    }

    public Cage(String cageCode) {
        this.cageCode = cageCode;
        this.pets = new ArrayList<Pet>();
        totalCages +=1;
    }


    public String getCageCode() {
        return cageCode;
    }

    public void setCageCode(String cageCode) {
        this.cageCode = cageCode;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
    }

    public int getCurrentPetCount() {
        return currentPetCount;
    }

    public void setCurrentPetCount(int currentPetCount) {
        this.currentPetCount = currentPetCount;
    }

    public static int getTotalCages() {
        return totalCages;
    }

    public static void setTotalCages(int totalCages) {
        Cage.totalCages = totalCages;
    }

    void addPet(Pet pet) {
        if(currentPetCount <= MAX_CAPACITY) {
            pets.add(pet);
            currentPetCount += 1;
        }
        else {
            System.out.println("Số pet trong lồng đã đạt giới hạn!");
        }
    }

    void printAllPets() {
        System.out.println(cageCode);
        for (Pet pet : pets) {
            pet.printInfo();
        }
    }

    void printTotalCages() {
        System.out.println(totalCages);
    }

    void printOverweight() {
        for(Pet pet : pets) {
            if(pet.isOverweight()) {
                pet.printInfo();
            }
        }
    }


}
