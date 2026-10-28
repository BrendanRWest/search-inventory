package com.pluralsight;

import java.util.ArrayList;

public class SearchInventory {
    public static void main(String[] args) {
        ArrayList<Product> inventory = getInventory();

        for (Product product : inventory) {
            System.out.println(product);
        }

    }

    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<>();

        inventory.add(new Product(123, "Pasta", 2.99));
        inventory.add(new Product(124, "Potato", 0.99));
        inventory.add(new Product(125, "Bag of Rice", 3.99));
        inventory.add(new Product(126, "1 lb Strawberries", 2.79));
        inventory.add(new Product(127, "Gallon of Milk", 4.99));


        return inventory;
    }
}

