/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingassistant;

/**
 *
 * @author fa22-bse-129
 */


import Domain.Customer;
import Domain.Item;
import Service.ShoppingService;

import java.util.Arrays;
import java.util.List;

public class ShoppingAssistant {
    public static void main(String[] args) {
        ShoppingService shoppingService = new ShoppingService();

        // Login
        String email = "john.doe@example.com";
        String password = "password123";
        if (!shoppingService.login(email, password)) {
            System.out.println("Login failed. Invalid credentials.");
            return;
        }

        System.out.println("Login successful.");

        // Customer information
        Customer customer = new Customer("1", "John Doe", email);

        // View items
        System.out.println("Available items:");
        for (Item item : shoppingService.viewItems()) {
            System.out.println(item.getId() + ": " + item.getName() + " - $" + item.getPrice());
        }

        // Make a purchase
        List<String> itemIds = Arrays.asList("1", "3");
        String paymentMethod = "Credit Card";
        shoppingService.makePurchase(customer, itemIds, paymentMethod);
    }
}

