package it.ecpicode.esercizio_1;

import Classi.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product(1, "Book A", "Books", 101.0));
        products.add(new Product(2, "Book B", "Books", 102.0));
        products.add(new Product(3, "Book C", "Books", 103.0));
        products.add(new Product(4, "Book D", "Books", 104.0));
        products.add(new Product(5, "Book E", "Books", 105.0));

        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) {
            if ("Books".equals(product.getCategory()) && product.getPrice() > 100) {
                filteredProducts.add(product);
            }
        }

// Display the filtered products
        for (Product product : filteredProducts) {
            System.out.println("Product ID: " + product.getId() + ", Name: " + product.getName() + ", Price: " + product.getPrice());

        }
    }
}
