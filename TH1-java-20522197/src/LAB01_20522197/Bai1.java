/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LAB01_20522197;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = sc.nextInt();
        System.out.print("Nhap b: ");
        int b = sc.nextInt();
        System.out.print("Nhap c: ");
        int c = sc.nextInt();
        System.out.print("Nhap d: ");
        int d = sc.nextInt();
        System.out.print("Trung binh cong a, b, c, d la: ");
        System.out.println((double)(a+b+c+d)/4);
    }
    
}
