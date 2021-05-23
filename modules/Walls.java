package ua.lviv.iot.items.modules;

import lombok.NoArgsConstructor;


@NoArgsConstructor

public class Walls extends Repairs {
    private String color;
    private String materials;
    private String typeOfReturn;

    public Walls( String brand, float price, CountryType originCountryType,  CategoryType categoryType,
                 String producer,
                 String color, String materials, String typeOfReturn){
        super( brand, price, originCountryType, categoryType, producer);

        this.color = color;
        this.materials = materials;
        this.typeOfReturn = typeOfReturn;

    }
    @Override
    public String toString() {
        return itemToString()
                + "|\n|Color: " + color
                + "|\n|Material: " + materials
                + "|\n|Type of return: " + typeOfReturn
                + "|\n________________________\n";
    }
}