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
public class Bai14 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a, b, c cach nhau 1 khoang trang: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.print("PT: ");
    if(a == 0) {
        if(b == 0) {
            if(c == 0)
                System.out.println("0 = 0");
            else
                System.out.println(c + " = 0");
        }
        else if(b == 1) {
            if(c == 0)
                System.out.println("X = 0");
            else
                System.out.println("X + " + c + " = 0");
        }
        else {
            if(c == 0)
                System.out.println(b + "X = 0");
            else
                System.out.println(b + "X + " + c + " = 0");
        }      
    }
    else if(a == 1) {
        if(b == 0) {
            if(c == 0)
                System.out.println("X^2 = 0");
            else
                System.out.println("X^2 + " + c + " = 0");
        }
        else if(b == 1) {
            if(c == 0)
                System.out.println("X^2 + X = 0");
            else
                System.out.println("X^2 + X + " + c + " = 0");
        }
        else {
            if(c == 0)
                System.out.println("X^2 + "+ b + "X = 0");
            else
                System.out.println("X^2 + " + b + "X + " + c + " = 0");
        }      
    }
    else {
        if(b == 0) {
            if(c == 0)
                System.out.println(a + "X^2 = 0");
            else
                System.out.println(a + "X^2 + " + c + " = 0");
        }
        else if(b == 1) {
            if(c == 0)
                System.out.println(a + "X^2 + X = 0");
            else
                System.out.println(a + "X^2 + X + " + c + " = 0");
        }
        else {
            if(c == 0)
                System.out.println(a + "X^2 + " + b + "X = 0");
            else
                System.out.println(a + "X^2 + " + b + "X + " + c + " = 0");
        }      
    }
 
    }
}
