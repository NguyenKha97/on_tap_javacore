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
public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap do dai ban kinh r: ");
        double r = sc.nextDouble();
        System.out.println("Chu vi hinh tron ban kinh r la: " + (double)Math.round((r*2*3.14)*1000)/1000 + " (dvdd)");
        System.out.println("Dien tich hinh tron ban kinh r la: " + (double)Math.round((r*r*3.14)*1000)/1000 + " (dvdt)");
    }
    
}
