/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package th1.java.pkg20522197;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so xe (gom 4 chu so): ");
        int n = sc.nextInt(), temp = n;
        int nut = 0;
        while(n/10 != 0 || n%10 !=0){
            nut += n%10;
            n /=10;
        }
        System.out.println("So xe " + temp + " duoc: " + (nut%10) + " nut.");
    }
}
