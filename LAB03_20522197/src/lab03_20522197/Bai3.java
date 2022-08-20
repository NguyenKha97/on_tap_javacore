/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab03_20522197;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Bai3 {
    
    public static void checkNum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap 1 so nguyen thuoc doan [-89, 90]: ");
        int x = sc.nextInt();
        while(x < -89 || x >90) {
            System.out.print("Nhap sai, moi nhap lai 1 so nguyen trong doan [-89, 90]: ");
            x = sc.nextInt();
        }
        System.out.println("Nhap dung");           
    }
    
    public static void main(String[] args) {
        checkNum();
    }
}
