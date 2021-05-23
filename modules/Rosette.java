package ua.lviv.iot.items.modules;

import lombok.NoArgsConstructor;

@NoArgsConstructor

public class Rosette extends Electricity {
    private RosetteType rosetteType;
    private int thikness;

    public Rosette( String brand, float price, CountryType originCountryType,  CategoryType categoryType,
                   String producer,
                   String brightness, int number,
                   RosetteType rosetteType, int thikness){
        super( brand, price, originCountryType, categoryType, producer, brightness, number);

        this.rosetteType = rosetteType;
        this.thikness = thikness;
    }
    @Override
    public String toString() {
        return itemToString()
                + "|\n|Rosette Type: " + rosetteType
                + "|\n|Thikness: " + thikness
                + "|\n________________________\n";
    }

}