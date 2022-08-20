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
public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap gio, phut, giay cach nhau 1 khoang trang: ");
        int h = sc. nextInt();
        int m = sc. nextInt();
        int s = sc. nextInt();
        while(h<0 || h >23 || m<0 || m >59 || s<0 || s>59) {
            System.out.print("Gio, phut, giay khong hop le, nhap gio, phut, giay cach nhau 1 khoang trang: ");
            h = sc. nextInt();
            m = sc. nextInt();
            s = sc. nextInt();
        }
        System.out.print(h + " gio " + m + " phut " + s + " giay.\n");
    }
}
