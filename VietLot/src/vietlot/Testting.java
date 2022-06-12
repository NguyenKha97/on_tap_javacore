/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vietlot;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Testting {
        public static void main(String[] args) {
        ArrayList<String []> a = new ArrayList<>();
        String b[] = {"not here","not here2"};
        String c[] = {"not here3","i'm here"};
        a.add(b);
        a.add(c);
        for (String[] array : a) {// This loop is used to iterate through the arraylist
            for (String element : array) {//This loop is used to iterate through the array inside the arraylist
                    System.out.println(element);
                
            }
        }
        System.out.println("match not found");
}
    }

