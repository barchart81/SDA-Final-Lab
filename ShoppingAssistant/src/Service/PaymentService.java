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

public class PaymentService {
    public boolean processPayment(String paymentMethod) {
        // Simulate payment processing
        if (paymentMethod.equals("Credit Card") || paymentMethod.equals("PayPal")) {
            System.out.println("Payment processed using: " + paymentMethod);
            return true;
        }
        System.out.println("Payment failed. Invalid payment method.");
        return false;
    }
}
