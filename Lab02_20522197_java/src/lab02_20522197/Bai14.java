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
public class Bai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so km da di: ");
        double km = sc.nextDouble();
        while(km<=0) {
            System.out.print("Ban di dau, nhap lai: ");
            km = sc.nextDouble();
        }
        double money = 0;
        if(km <= 1)
            money = km * 15000;
        else if(km <=5 )
            money = km * 13500;
        else
            money = km * 11000;
        if(km>120)
            money *=0.9;
        System.out.println("Tong tien phai tra: " + (int)money + " VND.");
    }
}
