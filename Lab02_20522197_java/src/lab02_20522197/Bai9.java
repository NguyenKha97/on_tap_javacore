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
public class Bai9 {
    public static void main(String[] args) {
        System.out.print("Nhap hinh: ");
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        while(c != 'v' && c != 't' && c!='n'){
            System.out.print("Ki tu khong hop le, nhap lai: ");
            c = sc.next().charAt(0);
        }
        if(c == 'v'){
            System.out.println("Tinh P va S cua hinh vuong");
            System.out.print("Nhap do dai canh: ");
            double l = sc.nextDouble();
            System.out.println("\tKet qua P = " + (double)l*4 + "  S = " + (double)l*l);
        } else if(c == 'n') {
            System.out.println("Tinh P va S cua hinh chu nhat");
            System.out.print("Nhap chieu rong: ");
            double r = sc.nextDouble();
            System.out.print("Nhap chieu dai: ");
            double d = sc.nextDouble();
            System.out.println("\tKet qua P = " + ((double)d+r)*2 + "  S = " + (double)d*r);
        } else {
            System.out.println("Tinh P va S cua hinh tron");
            System.out.print("Nhap do dai ban kinh r: ");
            double r = sc.nextDouble();
            System.out.println("\tKet qua P = " + (double)r*2*3.14 + "  S = " + (double)r*r*3.14);   
        }
        
    }
}
