/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02_20522197;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a, b, c cach nhau 1 khoang trang: ");
        int a = sc. nextInt();
        int b = sc. nextInt();
        int c = sc. nextInt();
        int max = a;
        max = (max<b)? b : max;
        max = (max<c)? c : max;
        System.out.println("Trong cac so " + a + ", " + b + ", " + c + " max = " + max);

    }
    
}
