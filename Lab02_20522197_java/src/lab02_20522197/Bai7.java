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
public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ki tu can chuyen doi: ");
        char c = sc.next().charAt(0);
        while(c<65 || (c>90 && c<97) || c>122){
            System.out.print("Ki tu khong hop le, vui long nhap lai: ");
            c = sc.next().charAt(0);
        }
        if(c<91)
            System.out.println("Ki tu in thuong: " + (char)(c+32));
        else
            System.out.println("Ki tu in hoa: " + (char)(c-32));
    }
}
