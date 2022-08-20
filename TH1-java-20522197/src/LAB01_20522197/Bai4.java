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
public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap N (10<= N <=99): ");
        int N = sc.nextInt();
        while(N < 10 || N > 99) {
            System.out.print("Nhap N (10<= N <=99): ");
            N = sc.nextInt();
        }
        System.out.println("Tong cac chu so cua " + N + " la: " +N/10 + " + "+ N%10 +" = " + (N/10 + N%10));
    }
    
}
