/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi2_java;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
/**
 *
 * @author admin
 */
public class RanDom {
    public static void main(String[] args) {
        double x = Math.random() * 100;
        System.out.println("Random = " + (int)x);
        
        Random rand = new Random();
        int ranNum = rand.nextInt(3);
        
        System.out.println("Random number is " + ranNum);
        
        int ranNum2 = ThreadLocalRandom.current().nextInt(1,101);
        System.out.println("Random number is " + ranNum2);
    }
}
