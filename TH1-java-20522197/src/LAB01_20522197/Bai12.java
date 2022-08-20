/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB01_20522197;
import java.util.Random;
/**
 *
 * @author admin
 */
public class Bai12 {
    public static void main(String[] args) {
        Random generator = new Random();
        System.out.print("0 - 100: ");
        System.out.println(generator.nextInt(0, 101));
        System.out.print("50 - 99: ");
        System.out.println(generator.nextInt(50, 100));
        System.out.print("-39 den 79: ");
        System.out.println(generator.nextInt(-39, 80));
        System.out.print("-79 den -39: ");
        System.out.println(generator.nextInt(-79, -38));
    }
    
}
