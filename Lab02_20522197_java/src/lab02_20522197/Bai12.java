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
public class Bai12 {
    public static void main(String[] args) {
        System.out.print("Nhap thang nam cach nhau 1 khoang trang: ");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int y = sc.nextInt();
        while(m<=0 || m>12 || y<0) {
            System.out.print("Thang hoac nam khong hop le, nhap lai: ");
            m = sc.nextInt();
            y = sc.nextInt();
        }
        switch(m) {
            case 1,3,5,7,8,10,12:
                System.out.println("Thang " + m + " nam " + y +" co 31 ngay.");
                break;
            case 4,6,9,11:
                System.out.println("Thang " + m +" nam " + y + " co 30 ngay.");
                break;
            case 2:
                if((y%4==0 && y%100!=0)||y%400==0)
                    System.out.println("Thang 2 " + "nam " + y + " co 29 ngay.");
                else
                    System.out.println("Thang 2 " + "nam " + y + " co 28 ngay.");
                break;
        }
            
    }
}
