/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn_buoi1_20522197_java;
import java.util.HashSet;

/**
 *
 * @author admin
 */
public class HshSet {
    public static void main(String[] args) {
        HashSet<Integer> telNums = new HashSet<Integer>();

    telNums.add(113);
    telNums.add(113);
    telNums.add(114);
    telNums.add(115);
    
    for (int i : telNums) {
        System.out.println(i);
    }   

    for(int i = 110; i <= 116; i++) {
      if(telNums.contains(i)) {
        System.out.println(i + " was found in the set.");
      } else {
        System.out.println(i + " was not found in the set.");
      }
    }
    telNums.remove(114);
    if(telNums.contains(114)) {
        System.out.println(114 + " was found in the set.");
      } else {
        System.out.println(114 + " was not found in the set.");
      }
    }
    
}
