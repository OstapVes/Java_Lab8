package ua.lviv.iot.items.modules;

import lombok.NoArgsConstructor;

@NoArgsConstructor

public class Electricity extends Repairs {
    private String brightness;
    private int number;

    public Electricity( String brand, float price, CountryType originCountryType,  CategoryType categoryType,
                       String producer,
                       String brightness, int number){
        super( brand, price, originCountryType, categoryType, producer);

        this.brightness = brightness;
        this.number = number;
    }
    @Override
    public String toString() {
        return itemToString()
                + "|\n|Brightness: " + brightness
                + "|\n|Number: " + number
                + "|\n________________________\n";
    }

}