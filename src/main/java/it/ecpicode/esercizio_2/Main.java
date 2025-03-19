package it.ecpicode.esercizio_2;


import Classi.Customer;
import Classi.Order;
import Classi.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    List<Order> orders = new ArrayList<>();

        public static void main(String[] args) {
            List<Order> orders = new ArrayList<>();


            Order order1 = new Order(1, "In elaborazione", LocalDate.now().plusDays(3), List.of(new Product(1, "Pannolino", "Baby", 10.0)), new Customer(1, "Mario", 1));
            Order order2 = new Order(2, "Spedito", LocalDate.now().plusDays(5), List.of(new Product(2, "Culla", "Baby", 50.0)), new Customer(2, "Luigi", 2));
            Order order3 = new Order(3, "In elaborazione", LocalDate.now().plusDays(7), List.of(new Product(3, "Biberon", "Baby", 20.0)), new Customer(3, "Giovanni", 3));
            orders.add(order1);
            orders.add(order2);
            orders.add(order3);


            List<Order> babyCategoryOrders = new ArrayList<>();
            for (Order order : orders) {
                for (Product product : order.getProducts()) {
                    if ("Baby".equals(product.getCategory())) {
                        babyCategoryOrders.add(order);
                        break;
                    }
                }
            }

            for (Order order : babyCategoryOrders) {

                for (Product product : order.getProducts()) {
                    System.out.println("Order ID: " + order.getId() + ", Nome Prodotto: " + product.getName() + ", Categoria: " + order.getProducts().get(0).getCategory() + ", Status: " + order.getStatus() + ", Customer: " + order.getCustomer().getName());
                }
            }
        }
    }