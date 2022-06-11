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
public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap nam sinh: ");
        int y = sc.nextInt();
        if( y>2022)
            System.out.println("Ban chua sinh ra doi.");
        else if(y==2022)
            System.out.println("Chao mung ban den voi the gioi");
        else
            System.out.println("Ban sinh nam " + y + " vay ban " + (2022-y) + " tuoi.");
    }
}
