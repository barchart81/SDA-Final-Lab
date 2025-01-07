/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

/**
 *
 * @author fa22-bse-129
 */

import Domain.Customer;
import Domain.Item;
import Domain.Order;
import Repository.ItemRepository;
import Repository.OrderRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ShoppingService {
    private ItemRepository itemRepository = new ItemRepository();
    private OrderRepository orderRepository = new OrderRepository();
    private AuthenticationService authenticationService = new AuthenticationService();
    private PaymentService paymentService = new PaymentService();

    public boolean login(String email, String password) {
        return authenticationService.authenticate(email, password);
    }

    public List<Item> viewItems() {
        return itemRepository.getAllItems();
    }

    public void makePurchase(Customer customer, List<String> itemIds, String paymentMethod) {
        List<Item> selectedItems = new ArrayList<>();
        for (String itemId : itemIds) {
            Item item = itemRepository.getItemById(itemId);
            if (item != null) {
                selectedItems.add(item);
            }
        }

        if (selectedItems.isEmpty()) {
            System.out.println("No valid items selected for purchase.");
            return;
        }

        Order order = new Order(UUID.randomUUID().toString(), customer, selectedItems);
        order.setState("Checkout");

        boolean paymentSuccess = paymentService.processPayment(paymentMethod);
        if (paymentSuccess) {
            order.setState("Completed");
            orderRepository.saveOrder(order);
            System.out.println("Purchase completed successfully!");
        } else {
            order.setState("Failed");
            System.out.println("Purchase failed due to payment issues.");
        }
    }
}

