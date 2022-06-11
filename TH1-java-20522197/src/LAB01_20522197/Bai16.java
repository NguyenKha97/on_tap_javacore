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
public class Bai16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a, b cach nhau 1 khoang trang: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.print("((a+b)/(3Va + 3Vb)-3V(a*b)) / (3Va - 3Vb)^2 = ");
        double result = (((double)a+b)/(Math.cbrt(a)+Math.cbrt(b)) - Math.cbrt((double)a*b))/ (double)Math.pow((Math.cbrt(a)-Math.cbrt(b)),2);
        System.out.println(result);
        
    }
}
