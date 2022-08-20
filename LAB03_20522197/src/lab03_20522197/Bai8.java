/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab03_20522197;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Bai8 {
    
    static private double[] arr;
    static private int n;
    final static private Scanner SC = new Scanner(System.in);
    
    public static void taoMang() {
        Random generator = new Random();
        n = generator.nextInt(1, 10);
        arr = new double[n];
        for(int i=0; i<n; i++)
            arr[i] = generator.nextDouble(-99, 99);
        System.out.println("Done.");
    }
    
    public static void xuatMang() {
        System.out.print("Mang: ");
        for(int i=0; i<n; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }
    
    public static void viTriAm() {
        System.out.print("Vi tri cac gia tri am trong mang: ");
        for(int i=0; i<n; i++)
            if(arr[i] < 0)
                System.out.print((i+1) + " ");
        System.out.println("");
    }
    
    public static void giaTriChan() {
        System.out.print("Cac gia tri chan trong mang: ");
        for (int i = 0; i < n; i++) {
            if ((int)arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("");
    }
    
    public static void lonnhat() {
        double max = arr[0];
        for(int i=0; i<n; i++) {
            if(max < arr[i])
                max = arr[i];
        }
        System.out.println("Gia tri lon nhat cua mang la: " + max);
    }
    
    public static void duongdau() {
        for(int i=0; i<n; i++)
            if(arr[i] > 0) {
                System.out.println("Gia tri duong dau tien cua mang la: " + arr[i]);
                return;
            }
        System.out.println("-1");
    }
    
    public static void chancuoi() {
        for(int i=(n-1); i>=0; i--)
            if((int)arr[i] %2 == 0) {
                System.out.println("Gia tri chan cuoi cung cua mang la: " + arr[i]);
                return;
            }
        System.out.println(-1);
    }
    
    public static void vitrinhonhat() {
        double min = arr[0];
        for(int i=0; i<n; i++) {
            if(min > arr[i])
                min = arr[i];
        }
        System.out.print("Vi tri co gia tri nho nhat trong mang: ");
        for(int i=0; i<n; i++)
            if(arr[i] == min)
                System.out.print((i+1) + " ");
        System.out.println("");      
    }
    
    public static void vitrichandau() {
        for(int i=0; i<n; i++)
            if((int)arr[i] % 2 == 0) {
                System.out.println("Gia tri chan dau tien cua mang la: " + (i+1));
                return;
            }
        System.out.println("-1");
    }
    
    public static void main(String[] args) {
        
        System.out.println("Menu lua chon phuong thuc:");
        System.out.println("Ma PT\tTen phuong thuc");
        System.out.println("  1\tTao mang tu dong");
        System.out.println("  2\tXuat mang");
        System.out.println("  3\tLiet ke cac vi tri co gia tri am");
        System.out.println("  4\tLiet ke cac gia tri chan");
        System.out.println("  5\tTim gia tro lon nhat");
        System.out.println("  6\tTim gia duong dau tien");
        System.out.println("  7\tTim gia chan cuoi cung");
        System.out.println("  8\tTim vi tri co gia tri nho nhat");
        System.out.println("  9\tTim vi tri co gia tri chan dau tien");
        System.out.print("Nhap ma phuong thuc muon thuc hien: ");
        int idMethod = SC.nextInt();
        do{
        while(idMethod <1 || idMethod>9) {
            System.out.print("Khong co phuong thuc nay, moi nhap lai: ");
            idMethod = SC.nextInt();
        }   
        switch(idMethod) {
            case 1 -> taoMang();
            case 2 -> xuatMang();
            case 3 -> viTriAm();
            case 4 -> giaTriChan();
            case 5 -> lonnhat();
            case 6 -> duongdau();
            case 7 -> chancuoi();
            case 8 -> vitrinhonhat();
            case 9 -> vitrichandau();
        }
        System.out.print("Nhap ma phuong thuc neu ban muon thuc hien phuong thuc tiep theo, nhap 0 de thoat: ");
        idMethod = SC.nextInt();
        }
        while(idMethod !=0);      
    }
}
