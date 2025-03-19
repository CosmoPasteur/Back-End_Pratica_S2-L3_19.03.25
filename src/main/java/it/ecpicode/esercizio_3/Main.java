package it.ecpicode.esercizio_3;

import Classi.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product(1, "Toy Car", "Boys", 15.0));
        products.add(new Product(2, "Action Figure", "Boys", 20.0));
        products.add(new Product(3, "Lego Set", "Boys", 30.0));
        products.add(new Product(4, "Soccer Ball", "Boys", 25.0));
        products.add(new Product(5, "Race Track", "Boys", 35.0));


        // Display the products
        for (Product product : products) {
            if (product.getCategory().equals("Boys")) {
                product.setPrice(product.getPrice() * 0.9);
            }
            System.out.println("Product ID: " + product.getId() + ", Name: " + product.getName() + ", Category: " + product.getCategory() + ", Price: " + product.getPrice());
        }
    }

}
