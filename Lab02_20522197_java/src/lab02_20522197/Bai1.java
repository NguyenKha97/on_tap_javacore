/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab02_20522197;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a, b, c, d cach nhau 1 khoang trang: ");
        int a = sc. nextInt();
        int b = sc. nextInt();
        int c = sc. nextInt();
        int d = sc. nextInt();
        int min = a;
        min = (min>b)? b : min;
        min = (min>c)? c : min;
        min = (min>d)? d : min;
        
        System.out.println("Trong cac so " + a + ", " + b + ", " + c + ", " + d + " min = " + min);
                
                
    }
    
}
