package BaiTap2.B3;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person(new Address("Tan Mai", "TPHCM"));
        people[1] = new Person((new Address("Dai Phuc", "Bac Ninh")));
        people[2] = new Person(new Address("Tan Phu", "TPHCM"));

        for(Person person : people) {
            System.out.println(person);
        }
    }
}
