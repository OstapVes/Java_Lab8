package ua.lviv.iot.items;

import ua.lviv.iot.items.modules.*;
import ua.lviv.iot.items.manager.*;

import java.util.ArrayList;


public class App {

    public static void main(String[] args) {
        RepairManager manager = new RepairManager(new ArrayList<>());
        manager.getGoodsList().add(new Floor("Ibud", 1,
                CountryType.USA, CategoryType.Floor, "Plannja", MaterialsType.Ceramic, 50));
        manager.getGoodsList().add(new Floor("Tytan", 50,
                CountryType.Germany, CategoryType.Floor, "Nicoll", MaterialsType.Granite, 100));


        manager.getGoodsList().add(new Walls("Struga", 155,
                CountryType.Ukraine, CategoryType.Walls, "Hunter", "White", "Acrylic", "Paint"));
        manager.getGoodsList().add(new Walls("Ibud", 400,
                CountryType.USA, CategoryType.Walls, "KATEPAL", "Green", "Paper", "Wallpaper"));


        manager.getGoodsList().add(new Electricity("Bryza", 10,
                CountryType.Ukraine, CategoryType.Electricity, "Zambelli", "Bright", 12));
        manager.getGoodsList().add(new Electricity("Plastmo", 56,
                CountryType.Germany, CategoryType.Electricity, "TAC", "Medium bright", 6));

        System.out.println("**************************************************");
        System.out.println("\n\n\n========================\nItems for repair:\n========================\n\n\n");
        System.out.println("**************************************************");
        manager.goodsList.forEach(System.out::println);
        System.out.println("**************************************************");
        System.out.println("\n\n\n========================\nSorted by price min-max:\n========================\n\n\n");
        System.out.println("**************************************************");
        manager.sortByPrice(false).forEach(System.out::println);
        System.out.println("**************************************************");
        System.out.println("\n\n\n========================\nSorted by price max-min:\n========================\n\n\n");
        System.out.println("**************************************************");
        manager.sortByPrice(true).forEach(System.out::println);
        System.out.println("**************************************************");
        System.out.println("\n\n\n========================\nTHE END\n========================\n\n\n");
        System.out.println("**************************************************");


    }
}