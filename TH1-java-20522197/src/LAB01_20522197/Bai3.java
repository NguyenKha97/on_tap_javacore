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
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = sc.nextInt();
        System.out.print("Nhap b: ");
        int b = sc.nextInt();
        while(b == 0){
            System.out.println("b khong the = 0, moi nhap lai");
            System.out.print("Nhap b: ");
            b = sc.nextInt();
        }
        System.out.println("Phan nguyen cua a/b la: " + a/b);
        System.out.println("Phan du cua a/b la: " + a%b);
    }
}
