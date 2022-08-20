/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab03_20522197;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Bai1 {
    
    public static boolean checkNum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so can kiem tra (co gia tri chan va la so am): ");
        int x = sc.nextInt();
        if(x % 2 == 0 && x <0)
            return true;
        return false;
    }
    
    public static void main(String[] args) {
        boolean answer = checkNum();
        System.out.println(answer);
    }
    
}
