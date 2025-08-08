public class Pet {
    protected String name;
    protected double weight;
    protected String species;

    public Pet(String name, double weight, String species) {
        this.name = name;
        this.weight = weight;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    void printInfo() {
        System.out.println("Name: " + name + " | Species: " + species + " | Weight: " + weight);
    }

    boolean isOverweight() {
        return weight > 10;
    }


    String getBasicInfo() {
        return name + species;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", species='" + species + '\'' +
                '}';
    }
}
