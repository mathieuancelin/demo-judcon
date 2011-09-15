package org.jugsummercamp.demo.api;

import java.util.UUID;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Hotel {

    private String id;
    
    private String name;

    private String address;

    private String country;
    
    private String zip;
    
    private Double price;

    public Hotel() {
        this.id = UUID.randomUUID().toString().toLowerCase();
    }

    public Hotel(String name, String address, String country, String zip, Double price) {
        this.name = name;
        this.address = address;
        this.country = country;
        this.zip = zip;
        this.price = price;
        this.id = UUID.randomUUID().toString().toLowerCase();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
