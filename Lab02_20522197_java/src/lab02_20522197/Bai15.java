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
public class Bai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong n: ");
        int n = sc.nextInt();
        for(int i=1; i<=(int)Math.sqrt((double)n); i++)
            if((int)Math.pow(i, 2) == n) {
                System.out.println(n + " la so chinh phuong.");
                return;
            }
        System.out.println(n + " khong la so chinh phuong.");
    }
}
