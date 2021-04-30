package ua.lviv.iot.items.modules;

import lombok.NoArgsConstructor;

@NoArgsConstructor

public class Tile extends Floor {
    private String strength;
    private int distance;

    public Tile( String brand, float price, CountryType originCountryType,  CategoryType categoryType,
                String producer,
                MaterialsType materialsType, Integer size,
                String strength, int distance){
        super( brand, price, originCountryType, categoryType, producer, materialsType, size);

        this.strength = strength;
        this.distance = distance;
    }
    @Override
    public String toString() {
        return itemToString()
                + "|\n|Strength: " + strength
                + "|\n|Distance: " + distance
                + "|\n________________________\n";
    }

}