/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn_buoi1_20522197_java;
import java.util.LinkedList;

/**
 *
 * @author admin
 */
public class LinkLst {
    public static void main(String[] args) {
        LinkedList<Double> scores = new LinkedList<Double>();
        scores.add(10.0);
        scores.add(8.978);
        scores.add((double)7);
        scores.add(1, 3.45);
        
        System.out.println(scores.getFirst());
        System.out.println(scores.getLast());
        
        while(!scores.isEmpty()) {
            System.out.println(scores.getFirst());
            scores.pop();
        }
        
    }
}
