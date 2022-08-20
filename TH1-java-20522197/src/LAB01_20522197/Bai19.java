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
public class Bai19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap gio phut giay(1) theo thu tu cach nhau 1 khoang trang: ");
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int s1 = sc.nextInt();
        System.out.print("Nhap gio phut giay(2) theo thu tu cach nhau 1 khoang trang: ");
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        int s2 = sc.nextInt();
        int h =0, m =0, s =0;
        s = s1 + s2;
        while(s >= 60) {
            s -= 60;
            m ++;
        }
        m += (m1 + m2);
        while(m >= 60) {
            m -=60;
            h++;
        }
        h += (h1 + h2);
        System.out.println(h1 + "h" + m1 + "p" + s1 + "s + " + h2 + "h" + m2 + "p" + s2 + "s = " + h + "h" + m + "p" + s + "s.");
    }
    
}
