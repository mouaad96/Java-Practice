package org.example;

public class University {
    private String name;
    private String address;
    private String city;

    public University(String name, String address, String city) {
        this.name = name;
        this.address = address;
        this.city = city;
    }

    public University() {
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                '}';
    }





}
