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

public class AuthenticationService {
    public boolean authenticate(String email, String password) {
        // Simulated authentication (In real scenarios, this would query a user database)
        return email.equals("john.doe@example.com") && password.equals("password123");
    }
}

