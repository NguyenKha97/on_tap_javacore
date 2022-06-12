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
public class Bai17_18_19_20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong n: ");
        int n = sc.nextInt(), sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 1;
        /*
        System.out.print("Bai 17: S = ");
        for (int i = 1; i < n; i++) {
            System.out.print(i + " + ");
            sum1 += i;
        }
        sum1 += n;
        System.out.print(n + " = " + sum1 + "\n");
        
        System.out.print("Bai 18: S = ");
        for (int i = 1; i < n; i++) {
            System.out.print(i + "^2 + ");
            sum2 += (i * i);
        }
        sum2 += (n * n);
        System.out.print(n + "^2 = " + sum2 + "\n"); 
        while (n % 2 != 0 || n < 0) {
            System.out.print("N da nhap khong dung voi yeu cau bai 19, nhap lai n chan > 0: ");
            n = sc.nextInt();
        }
        
        System.out.print("Bai 19: S = ");
        if (n == 2) {
            System.out.println(2);
        } else {
            for (int i = 2; i < n; i+=2) {
                    System.out.print(i + " + ");
                    sum3 += i;  
            }
            sum3 += n;
            System.out.print(n + " = " + sum3 + "\n");
        }
        */
        while (n % 2 == 0 || n < 0) {
            System.out.print("N da nhap khong dung voi yeu cau bai 19, nhap lai n le > 0: ");
            n = sc.nextInt();
        }
        System.out.print("Bai 20: S = ");
        if (n == 1) {
            System.out.println(1);
        } else {
            for (int i = 1; i < n; i+=2) {
                    System.out.print(i + " * ");
                    sum4 *= i;
            }
            sum4 *= n;
            System.out.print(n + " = " + sum4 + "\n");
        }

    }
}
