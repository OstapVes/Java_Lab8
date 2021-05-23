package ua.lviv.iot.items.modules;

import lombok.NoArgsConstructor;


@NoArgsConstructor


public class Repairs {
    private String brand;
    private float price;
    private CountryType originCountryType;
    private CategoryType categoryType;
    private String producer;

    public Repairs(String brand, float price, CountryType originCountryType, CategoryType categoryType,
                   String producer) {
        this.brand = brand;
        this.price = price;
        this.originCountryType = originCountryType;
        this.categoryType = categoryType;
        this.producer = producer;

    }


    @Override
    public String toString() {
        return itemToString() + "\n________________________\n";
    }

    public String itemToString() {
        return "________________________"
                + "|\n|brand: " + brand
                + "|\n|Price: " + price
                + "|\n|Country: " + originCountryType
                + "|\n|Category type: " + categoryType
                + "|\n|Producer: " + producer;
    }


    public float getPrice() {
        return price;
    }

}