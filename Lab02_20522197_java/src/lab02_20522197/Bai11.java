/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02_20522197;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Bai11 {
    public static void main(String[] args) {
        System.out.print("Nhap N nguyen duong: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n<=0){
            System.out.print("N phai >0, nhap lai: ");
            n = sc.nextInt();
        }
        int sum = 0;  
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(n/10 !=0 || n%10 !=0) {
            sum+=n%10;
            arr.add(n%10);
            n = n/10;
        }
        for(int i =arr.size()-1; i>0; i--)
            System.out.print(arr.get(i) + " + ");
        System.out.print(arr.get(0) + " = " + sum + "\n");
        
    }
}
