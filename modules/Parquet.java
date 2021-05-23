package ua.lviv.iot.items.modules;

import lombok.NoArgsConstructor;

@NoArgsConstructor

public class Parquet extends Floor {
    private String fastening;

    public Parquet( String brand, float price, CountryType originCountryType,  CategoryType categoryType,
                String producer,
                MaterialsType materialsType, Integer size,
                String fastening){
        super( brand, price, originCountryType, categoryType, producer, materialsType, size);

        this.fastening = fastening;
    }
    @Override
    public String toString() {
        return itemToString()
                + "|\n|Fastening: " + fastening
                + "|\n________________________\n";
    }

}