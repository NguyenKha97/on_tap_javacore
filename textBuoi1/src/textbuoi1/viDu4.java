/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textbuoi1;

/**
 *
 * @author admin
 */

public class viDu4 {
    public static void main(String[] args) {
        String s = "abc";
        String s1 = "efghijk";
        String s2 = "kha";
        s = s.replace(s, "abcd");
        s = s.join(s1, s, s2);
        int x = s.length();
        System.out.println("Do dai chuoi " + s + " la: " + x);
       
    }
    
}
