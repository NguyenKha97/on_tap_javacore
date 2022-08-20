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
public class Bai16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong n: ");
        int n = sc.nextInt();
        if (n == 1 || n==2) {
            System.out.println(n + " la so nguyen to.");
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    System.out.println(n + " khong la so nguyen to.");
                    return;
                }
            }
            System.out.println(n + " la so nguyen to.");
        }

    }
}
