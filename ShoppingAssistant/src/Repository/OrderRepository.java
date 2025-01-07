/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

/**
 *
 * @author fa22-bse-129
 */

import Domain.Order;
import java.util.ArrayList;
import java.util.List;

public class OrderRepository {
    private static List<Order> orders = new ArrayList<>();

    public void saveOrder(Order order) {
        orders.add(order);
        System.out.println("Order saved: " + order.getOrderId());
    }
}

