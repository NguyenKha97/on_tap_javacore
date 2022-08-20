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
public class Bai10 {
    public static void main(String[] args) {
        System.out.print("Nhap N nguyen duong: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n<=0){
            System.out.print("N phai >0, nhap lai: ");
            n = sc.nextInt();
        }
        System.out.print("Cac uoc so cua " + n + " la: ");
        for(int i=1; i<n; i++){
            if(n % i == 0)
                System.out.print(i + ", ");
        }
        System.out.print(n + "\n");
    }
}
