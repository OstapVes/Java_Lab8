package ua.lviv.iot.items.modules;

import lombok.NoArgsConstructor;

@NoArgsConstructor

public class Linoleum extends Floor {
    private int thikness;

    public Linoleum( String brand, float price, CountryType originCountryType,  CategoryType categoryType,
                String producer,
                MaterialsType materialsType, Integer size,
                int thikness){
        super( brand, price, originCountryType, categoryType, producer, materialsType, size);

        this.thikness = thikness;
    }
    @Override
    public String toString() {
        return itemToString()
                + "|\n|Thikness: " + thikness
                + "|\n________________________\n";
    }

}