package ua.lviv.iot.lab10.models;

import lombok.*;
import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table(name = "lesson_order")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String brand;
    private Integer price;
    private String originCountryType;
    private String categoryType;



    @NonNull
    private String producer;

    public Order(String brand, Integer price, String originCountryType, String categoryType, @NonNull String producer) {
        this.brand = brand;
        this.price = price;
        this.originCountryType = originCountryType;
        this.categoryType = categoryType;
        this.producer = getProducer();
    }
}
