/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB01_20522197;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = sc.nextInt();
        System.out.print("Nhap b: ");
        int b = sc.nextInt();
        System.out.println("a + b = " + (a+b));
        System.out.println("a - b = " + (a-b));
        System.out.println("a x b = " + (a*b));
//        System.out.print("(dung printf) a : b = ");
//        double temp = (double)a/b;
//        System.out.printf("%.3f%n", temp);
        System.out.println("a : b = " + (double)Math.round(((double)a/b)*1000)/1000);
        
    }
    
}
