package ua.lviv.iot.items.modules;

import lombok.NoArgsConstructor;

@NoArgsConstructor

public class Floor extends Repairs {
    private MaterialsType materialsType;
    private int size;

    public Floor(String brand, float price, CountryType originCountryType, CategoryType categoryType,
                 String producer,
                 MaterialsType materialsType, Integer size) {
        super(brand, price, originCountryType, categoryType, producer);

        this.materialsType = materialsType;
        this.size = size;
    }

    @Override
    public String toString() {
        return itemToString()
                + "|\n|Materials: " + materialsType
                + "|\n|Size: " + size
                + "|\n________________________\n";

    }

}
