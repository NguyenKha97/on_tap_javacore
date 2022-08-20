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
public class Bai6 {
    
    public static int fibonanci(int n) {
        if(n == 1 || n == 2)
            return 1;
        else
            return fibonanci(n-1) + fibonanci(n-2);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        while(n<=0) {
            System.out.print("N khong phu hop, nhap lai n>0 : ");
            n = sc.nextInt();
        }
        System.out.print(n + " phan tu cua day Fibonanci la: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(fibonanci(i) + " ");
        }
    }
}
