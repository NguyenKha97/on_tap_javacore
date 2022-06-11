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
public class Bai8 {
    public static void main(String[] args) {
        System.out.println("Cau a)");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a, b, c cach nhau 1 khoang trang: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int min = (a<b)? ((a<c)? a:c):((b<c)? b : c);
        System.out.print("Tang dan: " + min + ", ");
        if(min == a) {
            if(b<c)
                System.out.print(b + ", " + c);
            else
                System.out.print(c + ", " + b);       
        } else if(min == b) {
            if(a<c)
                System.out.print(a + ", " + c);
            else
                System.out.print(c + ", " + a);
        } else {
            if(a<b)
                System.out.print(a + ", " + b);
            else
                System.out.print(b + ", " + a);
        }
        System.out.print("\nCau b)\nNhap N: ");
        int n = sc.nextInt();    
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(n/10 !=0 || n%10 !=0) {
            arr.add(n%10);
            n = n/10;
        }
        for(int i=0; i<arr.size()-1;i++) {
            int minA = arr.get(i);
            for(int j=i+1; j<arr.size(); j++) {
                if(minA > arr.get(j)){
                    int temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                    minA = arr.get(i);
                }
            }
        }
        for(int i : arr)
            System.out.print(i);
        System.out.print("\n");
    }
}
