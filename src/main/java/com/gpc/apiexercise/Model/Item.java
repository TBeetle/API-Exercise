package com.gpc.apiexercise.item;

import javax.persistence.*;

@Entity
@Table
public class Item {
    @Id
    @SequenceGenerator(
            name = "item_sequence",
            sequenceName = "item_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "item_sequence"
    )

    private Long id;
    private String ExternalId;
    private String description;
    private double price;
    private String brand;

    public Item() {

    }

    public Item(String ExternalId, String description, double price, String brand) {
        this.ExternalId = ExternalId;
        this.description = description;
        this.price = price;
        this.brand = brand;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getExternalId() {
        return ExternalId;
    }

    public void setExternalId(String ExternalId) {
        this.ExternalId = ExternalId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Item{\n" +
                "Database ID=" +id +
                "External ID=" + ExternalId +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                '}';
    }
}
