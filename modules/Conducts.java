package ua.lviv.iot.items.modules;

import lombok.NoArgsConstructor;

@NoArgsConstructor

public class Conducts extends Electricity {
    private String materials;
    private int thikness;

    public Conducts( String brand, float price, CountryType originCountryType,  CategoryType categoryType,
                   String producer,
                   String brightness, int number,
                   String materials, int thikness){
        super( brand, price, originCountryType, categoryType, producer, brightness, number);

        this.materials = materials;
        this.thikness = thikness;
    }
    @Override
    public String toString() {
        return itemToString()
                + "|\n|Materials: " + materials
                + "|\n|Thikness: " + thikness
                + "|\n________________________\n";
    }

}