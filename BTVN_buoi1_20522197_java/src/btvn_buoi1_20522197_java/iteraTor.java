/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn_buoi1_20522197_java;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author admin
 */
public class iteraTor {
     public static void main(String[] args) {
    ArrayList<String> name = new ArrayList<String>();
    name.add("An");
    name.add("Binh");
    name.add("Chau");
    name.add("Dung");
    System.out.println(name.size());
    System.out.println(name);
    Iterator<String> it = name.iterator();
    while(it.hasNext()) {
      String i = it.next();
      if(i.equalsIgnoreCase("an")) {
        it.remove();
      }
    }
    System.out.println(name.size());
    System.out.println(name);
  }
    
}
