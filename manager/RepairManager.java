package ua.lviv.iot.items.manager;

import lombok.Getter;
import lombok.NoArgsConstructor;
import ua.lviv.iot.items.modules.*;

import java.util.List;

@Getter
@NoArgsConstructor


public class RepairManager {
    public List<Repairs> goodsList;

    public RepairManager(List<Repairs> goods) {
        goodsList = goods;
    }

    public List<Repairs> sortByPrice(final boolean reverse) {
        if (reverse) {
            goodsList.sort((Repairs i1, Repairs i2) -> Float.compare(i2.getPrice(), i1.getPrice()));
        } else {
            goodsList.sort((Repairs i1, Repairs i2) -> Float.compare(i1.getPrice(), i2.getPrice()));
        }
        return goodsList;
    }


}