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
public class Bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ki tu can in hoa: ");
        char c = sc.next().charAt(0);
        if(c >= 'A' && c <= 'Z')
            System.out.println("ki tu " + c + " da la ky tu chu hoa.");
        else
            System.out.println((char)(c - 32));
    }
    
}
