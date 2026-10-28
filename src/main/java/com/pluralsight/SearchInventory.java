package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SearchInventory {
    public static void main(String[] args) {
        ArrayList<Product> inventory = getInventory();

        for (Product product : inventory) {
            System.out.println(product);
        }

    }

    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("inventory.csv"));

            String csvLine;

            while((csvLine = reader.readLine()) != null){
                String[] tokens = csvLine.split("\\|");

                int productId = Integer.parseInt(tokens[0]);
                String productName = tokens[1];
                Double productPrice = Double.parseDouble(tokens[2]);

                inventory.add(new Product(productId, productName, productPrice));

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Collections.sort(inventory, Comparator.comparing(Product::getName));

        return inventory;
    }
}

