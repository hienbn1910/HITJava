package BaiTap2.B3;

public class Person {
    Address address;

    public Person() {

    }

    public Person(Address address) {
        this.address = new Address(address.getStreet(), address.getCity());
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "address=" + address +
                '}';
    }
}
