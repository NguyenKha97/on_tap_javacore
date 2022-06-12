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
public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap gia tri a, b theo thu tu cach nhau 1 khoang trang: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a == 0) {
            if(b == 0) 
                System.out.println("PT : 0x + 0 = 0 luon dung voi moi x.");
            else
                System.out.println("PT : 0x + " + b + " = 0 vo nghiem");         
        }
        else if(a == 1) {
            if(b == 0) 
                System.out.println("PT : x + 0 = 0 co nghiem x = 0");
            else
                System.out.println("PT : x + " + b + " = 0 co nghiem x = " + -b); 
        }
        else {
            if(b == 0) 
                System.out.println("PT : " + a + "x + 0 = 0 co nghiem x = 0");
            else
                System.out.println("PT : " + a + "x + " + b + " = 0 co nghiem x = " + (double)Math.round((double)-b/a * 100000)/100000 + " hay x = " + -b + "/" + a); 
        }
    }
}
