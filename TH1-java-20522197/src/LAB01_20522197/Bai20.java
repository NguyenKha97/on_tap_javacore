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
public class Bai20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap gia tri b, c theo thu tu cach nhau 1 khoang trang: ");
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(b == 0) {
            if(c == 0) 
                System.out.println("PT : 0x + 0 = 0 luon dung voi moi x.");
            else
                System.out.println("PT : 0x + " + c + " = 0 vo nghiem");         
        }
        else if(b == 1) {
            if(c == 0) 
                System.out.println("PT : x + 0 = 0 co nghiem x = 0");
            else
                System.out.println("PT : x + " + c + " = 0 co nghiem x = " + -c); 
        }
        else {
            if(c == 0) 
                System.out.println("PT : " + b + "x + 0 = 0 co nghiem x = 0");
            else
                System.out.println("PT : " + b + "x + " + c + " = 0 co nghiem x = " + (double)Math.round((double)-c/b * 100000)/100000 + " hay x = " + -c + "/" + b); 
        }
    }

}
