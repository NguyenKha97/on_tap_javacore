/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn_buoi1_20522197_java;
import java.util.HashMap;

/**
 *
 * @author admin
 */
public class HshMap {
    public static void main(String[] args) {
        HashMap<Integer, String> idToName = new HashMap<Integer, String>();
        idToName.put(20522, "abc");
        idToName.put(20533, "bcd");
        idToName.put(20544, "efg");
        System.out.println(idToName);
        System.out.println(idToName.size());
        for (int i : idToName.keySet()) {
            System.out.println("key: " + i + " value: " + idToName.get(i));
        }
        idToName.clear();
        System.out.println(idToName);
        

}
    
}
