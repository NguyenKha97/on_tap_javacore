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
public class Bai10 {
    
    static private int[][] arr;
    static private int c;
    static private int r;
    final static private Scanner SC = new Scanner(System.in);
    
    public static void taoMang() {
        Random generator = new Random();
        c = generator.nextInt(1, 10);
//        r = generator.nextInt(1, 10);
        r = c;
        arr = new int[r][c];
        for(int i=0; i<r; i++) //r
            for(int j=0; j<c; j++)
                arr[i][j] = generator.nextInt(-39, 79);
        System.out.println("Done.");
    }
    
    public static void xuatMang() {
        System.out.println("Ma tran: ");
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++)
                System.out.print(arr[i][j] + "  ");
        System.out.println("");
        }
    }
    
    public static void lonnhat() {
        System.out.print("Phan tu lon nhat cua ma tran: ");
        int max  =arr[0][0];
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++)
                if(arr[i][j] > max)
                    max = arr[i][j];
        } 
        System.out.print(max + "\n");
    }
        
    public static void ktraVuong() {
        if(c == r)
            System.out.println("Ma tran vuong cap " + c);
        else
            System.out.println("Ma tran khong vuong");
    }
    
    public static void inCheoChinh() {
        if(c == r) {
            System.out.println("Cac phan tu tren duong cheo chinh: ");
        int tempC = 0;
            for(int i=0; i<r; i++) {
            	for(int j=0; j<c; j++) {
            		if(j>=tempC)
            			System.out.print(arr[i][j] + "  ");
            		else
            			System.out.print("   ");
            	}
            System.out.println();
            tempC++;
        }
        }
        else
            System.out.println("Ma tran khong vuong => khong the in duong cheo chinh.");
            
    }
    
    public static void inCheoPhu() {
        if(c == r) {
            System.out.println("Cac phan tu phia tren duong cheo phu: ");
        int tempR = r;
            for(int i=0; i<r; i++) {
            	for(int j=0; j<c; j++) {
            		if(j<tempR)
            			System.out.print(arr[i][j] + "  ");
            	}
            System.out.println();
            tempR--;
        }
        }
        else
            System.out.println("Ma tran khong vuong => khong the in duong cheo phu.");
            
    }
    
    public static void nhoNhatDong() {
        for(int i=0; i<r; i++) {
            System.out.print("Phan tu nho nhat cua dong thu " + (i+1) + ": ");
            int min = arr[i][0];
            for(int j=0; j<c; j++) {
                if(arr[i][j] < min)
                    min = arr[i][j];
            }
            System.out.print(min + "\n");
        }             
    }
    
     public static void lonNhatCot() {
        for(int i=0; i<c; i++) {
            System.out.print("Phan tu lon nhat cua cot thu " + (i+1) + ": ");
            int max = arr[0][i];
            for(int j=0; j<r; j++) {
                if(arr[j][i] > max)
                    max = arr[j][i];
            }
            System.out.print(max + "\n");
        }             
    }
     
    public static void ktraChan() {
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++) {
                if (arr[i][j] % 2 != 0) {
                    System.out.println("Ma tran co gia tri le");
                    return;
                }
            }
        System.out.println("Ma tran toan gia tri chan");
    }
    
    public static boolean ktraNgTo(int x) {
        if(x <= 0)
            return false;
        else if(x == 1 || x == 2)
            return true;
        for(int i=2; i<x; i++)
            if(x % i == 0)
                return false;
        return true;              
    }
    
    public static void inNgTo() {
        System.out.print("So nguyen to co trong ma tran la: ");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                if(ktraNgTo(arr[i][j]))
                    System.out.print(arr[i][j] + " ");
        System.out.println("");
    }
    
    public static int tanSuat(int n) {
        int count = 0;
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                if(arr[i][j] == n)
                    count++;
        return count;
    }
     
    public static void replace(int[][] a, int x) {
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                if(a[i][j] == x)
                    a[i][j] = 80;
    }
    
    public static int[][] copy() {
        int[][]a = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                a[i][j] = arr[i][j];
        return a;
    }
    
    public static void inTanSuat() {
        int[][] tempArr = copy();
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++){
                if (tempArr[i][j] != 80) {
                    System.out.println(tempArr[i][j] + " xuat hien " + tanSuat(tempArr[i][j]) + " lan");
                    replace(tempArr, tempArr[i][j]);
                }
            }
    }
    
    public static void main(String[] args) {
        System.out.println("Menu lua chon phuong thuc:");
        System.out.println("Ma PT\tTen phuong thuc");
        System.out.println("  1\tTao mang tu dong");
        System.out.println("  2\tXuat mang");
        System.out.println("  3\tTim phan tu lon nhat");
        System.out.println("  4\tKiem tra ma tran vuong");
        System.out.println("  5\tIn cac phan tu tren duong cheo chinh (neu la ma tran vuong)");
        System.out.println("  6\tIn cac phan tu tren duong cheo phu (neu la ma tran vuong)");
        System.out.println("  7\tXuat cac gia tri nho nhat tren tung dong");
        System.out.println("  8\tXuat cac gia tri lon nhat tren tung cot");
        System.out.println("  9\tKiem tra mang toan gia tri chan");
        System.out.println("  10\tIn cac so nguyen to co trong ma tran");
        System.out.println("  11\tIn tan suat xuat hien cac so trong ma tran");
        System.out.print("Nhap ma phuong thuc muon thuc hien: ");
        int idMethod = SC.nextInt();
        do{
        while(idMethod <1 || idMethod>11) {
            System.out.print("Khong co phuong thuc nay, moi nhap lai: ");
            idMethod = SC.nextInt();
        }   
        switch(idMethod) {
            case 1 -> taoMang();
            case 2 -> xuatMang();
            case 3 -> lonnhat();
            case 4 -> ktraVuong();
            case 5 -> inCheoChinh();
            case 6 -> inCheoPhu();
            case 7 -> nhoNhatDong();
            case 8 -> lonNhatCot();
            case 9 -> ktraChan();
            case 10 -> inNgTo();
            case 11 -> inTanSuat();
        }
        System.out.print("Nhap ma phuong thuc neu ban muon thuc hien phuong thuc tiep theo, nhap 0 de thoat: ");
        idMethod = SC.nextInt();
        }
        while(idMethod !=0);      
    }
}
