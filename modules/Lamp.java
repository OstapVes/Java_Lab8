package ua.lviv.iot.items.modules;

import lombok.NoArgsConstructor;

@NoArgsConstructor

public class Lamp extends Electricity {
    private int numberOfLight;

    public Lamp( String brand, float price, CountryType originCountryType,  CategoryType categoryType,
                    String producer,
                    String brightness, int number,
                    int numberOfLight){
        super( brand, price, originCountryType, categoryType, producer, brightness, number);

        this.numberOfLight = numberOfLight;
    }
    @Override
    public String toString() {
        return itemToString()
                + "|\n|Number Of Light: " + numberOfLight
                + "|\n________________________\n";
    }

}