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
public class Bai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ngay thang nam cach nhau 1 khoang trang: ");
        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("a) dinh dang dd/m/yyyy: " + d + "/" + m + "/" + y);
        System.out.println("b) dinh dang dd/m/yy: " + d + "/" + m + "/" + y%100);
        System.out.println("a) dinh dang yyyy/m/d: " + y + "/" + m + "/" + d);
    }
    
}
