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
public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap gio: ");
        int h = sc.nextInt();
        System.out.print("Nhap phut: ");
        int m = sc.nextInt();
        System.out.print("Nhap giay: ");
        int s = sc.nextInt();
        System.out.println(h + " gio " + m + " phut " + s + " giay = " + (s + m*60 + h *3600) + " giay");
    }
}
