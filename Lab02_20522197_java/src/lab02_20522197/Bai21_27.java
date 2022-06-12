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
public class Bai21_27 {
    
    public static int getSum(int n){
        int sum =0;
        for(int i=1; i<=n; i++)
            sum+=i;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong n: ");
        int n = sc.nextInt();
        double sum = 0, sum1 = 0, sum2 = 0, sum3 =0, sum4 =0, sum5=0, sum6=0;
        System.out.print("Bai 21: S = ");
        if (n == 1) {
            System.out.println(1);
        } else {
            for (int i = 1; i < n; i++) {
                if (i == 1) {
                    System.out.print(i + " + ");
                } else {
                    System.out.print(1 + "/" + i + " + ");
                }
                sum += ((double) 1 / i);
            }
            sum += ((double) 1 / n);
            System.out.print(1 + "/" + n + " = " + (double) Math.round((sum) * 1000) / 1000 + "\n");
        }
/*
        System.out.print("Bai 22: S = ");
        for (int i = 1; i < n; i++) {
            System.out.print(1 + "/" + i * 2 + " + ");
            sum1 += ((double) 1 / i * 2);
        }
        sum1 += ((double) 1 / (n * 2));
        System.out.print(1 + "/" + n * 2 + " = " + (double) Math.round((sum1) * 1000) / 1000 + "\n");

        System.out.print("Bai 23: S = ");
        if (n == 0) {
            System.out.println(1);
        } else {
            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    System.out.print(1 + " + ");
                } else {
                    System.out.print(1 + "/" + (i * 2 + 1) + " + ");
                }
                sum2 += ((double) 1 / (i * 2 + 1));
            }
            sum2 += ((double) 1 / (n * 2 + 1));
            System.out.print(1 + "/" + (n * 2 + 1) + " = " + (double) Math.round((sum2) * 1000) / 1000 + "\n");
        }
        
        System.out.print("Bai 24: S = ");
        for (int i = 1; i < n; i++) {
            System.out.print(1 + "/" + (i*(i+1)) + " + ");
            sum3 += ((double) 1 / (i*(i+1)));
        }
        sum3 += ((double) 1 / (n*(n+1)));
        System.out.print(1 + "/" + (n*(n+1)) + " = " + (double) Math.round((sum3) * 1000) / 1000 + "\n");
        
        System.out.print("Bai 25: S = ");
        for (int i = 1; i < n; i++) {
            System.out.print(i + "/" + (i+1) + " + ");
            sum4 += ((double) i / (i+1));
        }
        sum4 += ((double) n / (n+1));
        System.out.print(n + "/" + (n+1) + " = " + (double) Math.round((sum4) * 1000) / 1000 + "\n");
      
        System.out.print("Bai 26: S = ");
        for (int i = 0; i < n; i++) {
            System.out.print((i*2+1) + "/" + (2*i+2) + " + ");
            sum5 += ((double) (i*2+1) / (2*i+2));
        }
        sum5 += ((double) (n*2+1) / (n*2+2));
        System.out.print((n*2+1) + "/" + (n*2+2) + " = " + (double) Math.round((sum5) * 1000) / 1000 + "\n");
        
        System.out.print("Bai 27: Nhap x = ");
        int x = sc.nextInt();
        System.out.print("S("+ n +") = ");
        if(n==1)
            System.out.println(x);
        else {
        for (int i = 1; i < n; i++) {
            if(i==1)
                System.out.print(x + " + ");
            else
                System.out.print(x + "^" + i + "/" + getSum(i) + " + " );
            sum6 += ((double) Math.pow(x, i) / getSum(i));
        }
        sum6 += ((double) Math.pow(x,n) / getSum(n));
        System.out.print(x + "^" + n + "/" + getSum(n) + " = " + (double) Math.round((sum6) * 1000) / 1000 + "\n");
        }
        */
    }
}
