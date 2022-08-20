/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab03_20522197;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Bai9 {
    
    static private double[] arr;
    static private int n;
    final static private Scanner SC = new Scanner(System.in);
    
    public static void taoMang() {
        Random generator = new Random();
        n = generator.nextInt(10, 20);
        arr = new double[n];
        for(int i=0; i<n; i++)
            arr[i] = (double)Math.round(generator.nextDouble(-268, 339)*100)/100;
        System.out.println("Done.");
    }
    
    public static void xuatMang() {
        System.out.print("Mang: ");
        for(int i=0; i<n; i++)
            System.out.print(arr[i] + "  ");
        System.out.println("");
    }
    
    public static void tongTich() {
        double tong = 0; double tich = 1.0;
        for(int i=0; i<n; i++) {
            tong += arr[i];
            tich *= arr[i];
        }
        tong = (double)Math.round(tong*100)/100;
        tich /= 100000000;
        tich /= 100000000;
        tich = (double)Math.round(tich*100)/100;
        System.out.println("Tong = " + tong);
        System.out.println("Tich = " + tich + " x 10^16");
    }
    
    public static void xuatHienX() {
        System.out.print("Nhap x: ");
        int count = 0;
        double x = (double)Math.round(SC.nextDouble()*100)/100;
        for(int i=0; i<n; i++) {
            if(x == arr[i])
                count++;
        }
        System.out.println("So lan xuat hien " + x + " trong mang la: " + count);
    }
    
    public static void chanNhoHonX() {
        System.out.print("Nhap x: ");
        boolean flag = true;
        double x = (double)Math.round(SC.nextDouble()*100)/100;
        System.out.print("Cac phan tu chan nho hon " + x + ": ");
        for(int i=0; i<n; i++) {
            if(arr[i] < x && ((int)arr[i]) % 2 == 0)
                System.out.print(arr[i] + "  ");
                flag = false; 
        }
        if(flag)
            System.out.println(" khong co phan tu chan trong mang nho hon " + x);
        System.out.println("");
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
                System.out.print((i+1) + "  ");
        System.out.println("");      
    }
    
     public static void xuatMangDao() {
        System.out.print("Mang: ");
        for(int i=(n-1); i>=0; i--)
            System.out.print(arr[i] + "  ");
        System.out.println("");
    }
    
     public static void giaTriAm() {
        System.out.print("Cac gia tri am trong mang: ");
        for(int i=0; i<n; i++)
            if(arr[i] < 0)
                System.out.print(arr[i] + "  ");
        System.out.println("");
    }
     
     public static void thuocXY() {
        System.out.print("Nhap x: ");
        double x = (double)Math.round(SC.nextDouble()*100)/100;
        System.out.print("Nhap y: ");
        double y = (double)Math.round(SC.nextDouble()*100)/100;
        while(y <= x) {
            System.out.print("Nhap lai y > x: ");
            y = (double)Math.round(SC.nextDouble()*100)/100;
        }
        System.out.print("Cac gia tri trong mang thuoc doan [" + x + ", " + y + "]: ");
        for(int i=0; i<n; i++)
            if(arr[i] >= x && arr[i] <= y)
                System.out.print(arr[i] + "  ");
        System.out.println("");
    }
    
     public static void slThuocXY() {
         System.out.print("Nhap x: ");
        double x = (double)Math.round(SC.nextDouble()*100)/100;
        System.out.print("Nhap y: ");
        double y = (double)Math.round(SC.nextDouble()*100)/100;
        while(y <= x) {
            System.out.print("Nhap lai y > x: ");
            y = (double)Math.round(SC.nextDouble()*100)/100;
        }
        int count = 0;
        System.out.print("So luong cac gia tri trong mang thuoc doan [" + x + ", " + y + "]: ");
        for(int i=0; i<n; i++)
            if(arr[i] >= x && arr[i] <= y)
                count++;
         System.out.println(count);
     }
    
    public static void main(String[] args) {
        System.out.println("Menu lua chon phuong thuc:");
        System.out.println("Ma PT\tTen phuong thuc");
        System.out.println("  1\tTao mang tu dong");
        System.out.println("  2\tXuat mang");
        System.out.println("  3\tXuat tong, tich cac gia tri cua mang");
        System.out.println("  4\tSo lan xuat hien cua phan tu x");
        System.out.println("  5\tTra ve cac phan tu chan nho hon x:");
        System.out.println("  6\tVi tri phan tu nho nhat cua mang");
        System.out.println("  7\tXuat mang dao nguoc");
        System.out.println("  8\tCac so am trong mang");
        System.out.println("  9\tCac gia tri thuoc doan [x,y] co trong mang");
        System.out.println("  10\tSo luong cac gia tri thuoc doan [x,y] co trong mang");
        System.out.print("Nhap ma phuong thuc muon thuc hien: ");
        int idMethod = SC.nextInt();
        do{
        while(idMethod <1 || idMethod>10) {
            System.out.print("Khong co phuong thuc nay, moi nhap lai: ");
            idMethod = SC.nextInt();
        }   
        switch(idMethod) {
            case 1 -> taoMang();
            case 2 -> xuatMang();
            case 3 -> tongTich();
            case 4 -> xuatHienX();
            case 5 -> chanNhoHonX();
            case 6 -> vitrinhonhat();
            case 7 -> xuatMangDao();
            case 8 -> giaTriAm();
            case 9 -> thuocXY();
            case 10 -> slThuocXY();
        }
        System.out.print("Nhap ma phuong thuc neu ban muon thuc hien phuong thuc tiep theo, nhap 0 de thoat: ");
        idMethod = SC.nextInt();
        }
        while(idMethod !=0);      
    }
}
