/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package useraccount;

/**
 *
 * @author MALSHANI
 */
public class UserAccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        account ac = new Imp_account ();
        ac.register("malshani"," 123", "123");
        ac.welcomeUser();
    }
    
}
