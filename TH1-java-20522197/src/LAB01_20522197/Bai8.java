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
public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu cao (cm): ");
        double h = sc.nextDouble();
        h /= 100;
        System.out.print("Nhap can nang (kg): ");
        double w = sc.nextDouble();
        double bmi = (double)Math.round(w/(h*h)*10)/10;
        System.out.println("BMI cua ban la: " + bmi);
        if(bmi < 18.5)
            System.out.println("Tinh trang co the: Gay");
        else if(bmi>=18.5 && bmi <=24.9)
            System.out.println("Tinh trang co the: Binh thuong");
        else
            System.out.println("Tinh trang co the: Thua can");
        
        
    }
    
}
