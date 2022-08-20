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
public class Bai2 {
    
    public static int checkNum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so can kiem tra: ");
        int x = sc.nextInt();
        if(x % 2 != 0 && x <0)
            return -1;
        else if(x % 2 == 0 && x >0)
            return 1;
        else
            return 0;
    }
    
    public static void main(String[] args) {
        int temp = checkNum();
        System.out.println(temp);
    }
}
