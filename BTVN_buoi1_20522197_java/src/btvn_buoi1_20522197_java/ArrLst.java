/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn_buoi1_20522197_java;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class ArrLst {
    public static void main(String[] args) {
        ArrayList<String> animal = new ArrayList<String>();
        animal.add("pig");
        animal.add("fish");
        animal.add("dog");
        int arrIndex = 0;
        while(arrIndex < animal.size()) {
            System.out.println(animal.get(arrIndex));
            arrIndex++;
        }
    }
    
}
