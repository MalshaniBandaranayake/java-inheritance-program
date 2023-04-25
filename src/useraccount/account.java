/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package useraccount;

/**
 *
 * @author MALSHANI
 */
abstract public class account {
   abstract void register (String userName, String password, String repassword) ;
   void welcomeUser () {
       System.out.println("welcome to the account.........!!");
   }
}
