/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Walker
 */
public class CurrentUser {
    
    public static User currentUser;
    
    public static void makeUser(User user){
        currentUser = user;
    }
}
