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
public class Bai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap canh thu nhat: ");
        double a = sc.nextDouble();
        System.out.print("Nhap canh thu hai: ");
        double b = sc.nextDouble();
        System.out.print("Nhap canh thu ba: ");
        double c = sc.nextDouble();

        // ktra tam giac
        if ((a + b > c) && (a + c > b) && (b + c > a) && (a > 0) && (b > 0) && (c > 0))
            if ((a == b) && (b == c))
                System.out.println("Tam giac deu");
            else if ((a == b) || (a == c) || (b == c))
                System.out.println("Tam giac can");
            else if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == a * a + b * b))
                System.out.println("Tam giac vuong");
            else if (((a * a + b * b == c * c) && (a == b)) || ((a * a + c * c == b * b) && (a == c)) || 
                    ((b * b + c * c == a * a) && (b == c)))
                System.out.println("Tam giac vuong can");
            else
                System.out.println("Tam giac thuong");
        else
            System.out.println("3 canh tren khong tao thanh tam giac");
        sc.close();
    }
    
}
