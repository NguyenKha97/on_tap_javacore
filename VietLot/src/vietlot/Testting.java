/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vietlot;

import java.util.ArrayList;
import java.util.Random;

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
        
        Random ran = new Random();        
        String[] win = new String[6];
        int i=0; ArrayList<String> checkNum = new ArrayList<>();
        while(i<=5) {
            String temp = String.format("%02d", ran.nextInt(1, 45));
            while(checkNum.contains(temp)){
                temp = String.format("%02d", ran.nextInt(1, 45));
            }
            win[i] =  temp;
            checkNum.add(temp);
            i++;
        }     
        for(String k : win)
            System.out.print(k + " ");
        System.out.println("");
        for(String m : checkNum)
            System.out.print(m + " ");
}
    }

