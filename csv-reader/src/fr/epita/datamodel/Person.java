package fr.epita.datamodel;

public class Person {

    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "address='" + address + '\'' +
                '}';
    }
}
