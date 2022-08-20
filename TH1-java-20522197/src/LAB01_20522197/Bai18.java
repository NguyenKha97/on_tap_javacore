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
public class Bai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap 3 so nguyen: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max, min;
        max = (a < b)? ((b<c)? c:b) : ((a < c)? c:a);
//        if(max < b)
//            max = b;
//        if(max < c)
//            max = c;
        min = (a < b) ? ((a<c)? a:c) : ((b<c)? b:c);
//        if(min > b)
//            min = b;
//        if(min > c)
//            min = c;
        System.out.println("Trong 3 so da nhap " + a + ", " + b + ", " + c + ", so lon nhat la " + max + " va so nho nhat la " + min + ".");
  
    }
}
