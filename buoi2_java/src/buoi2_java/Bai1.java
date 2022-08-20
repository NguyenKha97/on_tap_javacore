/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi2_java;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhap n: ");
            n = sc.nextInt();
        }
        while(n <= 0);
        int result =1 , i=1, sum =0;
        while(i <= n) {
            sum += i;
            result *=i;
            i++;
        }
        System.out.println("Tong tu 1 den " + n + " =  " + sum);
        System.out.println(n + "! = " + result);
    }
}
