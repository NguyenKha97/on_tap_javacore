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
public class Bai7 {
    
    public static int getPerimeter(int d, int r) {
        return 2*(d+r);
    }
    
    public static int getArea(int d, int r) {
        return d * r;
    }
    
    public static void display(int d, int r) {
        for(int i =1; i<=r; i++) {
            for(int j =1; j<=d; j++) {
                if(i==1 || i==r)
                    System.out.print('*');
                else {
                    if (j == 1 || j == d) {
                        System.out.print('*');
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.print("\n");
        }               
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        int dai = sc.nextInt();
        while(dai<=0) {
            System.out.print("Chieu dai khong hop le, nhap lai chieu dai >0 : ");
            dai = sc.nextInt();
        }
        System.out.print("Nhap chieu rong: ");
        int rong = sc.nextInt();
        while(rong<=0) {
            System.out.print("Chieu rong khong hop le, nhap lai chieu rong >0 : ");
            rong = sc.nextInt();
        }
        System.out.println("Chu vi hinh chu nhat la: " + getPerimeter(dai, rong));
        System.out.println("Dien tich hinh chu nhat la: " + getArea(dai, rong));
        display(dai, rong);
    }
}
