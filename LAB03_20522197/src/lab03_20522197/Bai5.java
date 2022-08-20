package lab03_20522197;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Bai5 {
    private static final Scanner SC = new Scanner(System.in);
    
    public static long tongN(int n){
        long result = 1;
        for(int i = 2; i<=n; i++)
            result+=i;
        return result;
    }
    
    public static long tongN2(int n){
        long result = 0;
        for(int i = 1; i<=n; i++)
            result+=(i*10+2);
        return result;
    }
    
    public static double tong1PhanN(int n){
        double result = 1;
        for(int i = 2; i<=n; i++)
            result+=(1.0/i);
        return result;
    }
    
    public static long tongNGT(int n){
        long result = 1;
        for(int i = 2; i<=n; i++) {
//            int temp = 1;
//            for(int j = 1; j<=i; j++)
//                temp*=j;
//            result+=temp;
                result += tinhNGT(i);
        }
        return result;
    }
    
    public static long tinhNGT(int n){
        long result = 1;
        for(int i = 2; i<=n; i++)
            result*=i;
        return result;
    }
    
    public static void main(String[] args) {
     System.out.print("Nhap so nguyen duong n: ");
        int n = SC.nextInt();
        while(n<=0) {
            System.out.print("n khong phu hop, moi nhap lai n nguyen duong: ");
            n = SC.nextInt();
        }
        System.out.println("Menu lua chon phuong thuc:");
        System.out.println("Ma PT\tTen phuong thuc");
        System.out.println("  1\tTinh tong n");
        System.out.println("  2\tTinh tong n2");
        System.out.println("  3\tTinh tong 1/n");
        System.out.println("  4\tTinh tong n!");
        System.out.println("  5\tTinh n!");
        System.out.print("Nhap ma phuong thuc muon thuc hien: ");
        int idMethod = SC.nextInt();
        long temp; double temp1;
        do{
        while(idMethod <1 || idMethod>5) {
            System.out.print("Khong co phuong thuc nay, moi nhap lai: ");
            idMethod = SC.nextInt();
        }   
        switch(idMethod) {
            case 1 -> {temp = tongN(n); System.out.println("kq = " + temp);}
            case 2 -> {temp = tongN2(n); System.out.println("kq = " + temp);}
            case 3 -> {temp1 = tong1PhanN(n); System.out.println("kq = " + temp1);}
            case 4 -> {temp = tongNGT(n); System.out.println("kq = " + temp);}
            case 5 -> {temp = tinhNGT(n); System.out.println("kq = " + temp);}
        }
        System.out.print("Nhap ma phuong thuc neu ban muon thuc hien phuong thuc tiep theo, nhap 0 de thoat, nhap -1 de nhap lai n: ");
        idMethod = SC.nextInt();
            while (idMethod < 0) {
                System.out.print("Moi nhap lai gia tri n: ");
                n = SC.nextInt();
                System.out.print("Nhap ma phuong thuc neu ban muon thuc hien phuong thuc tiep theo, nhap 0 de thoat, nhap -1 de nhap lai n: ");
                idMethod = SC.nextInt();
            }
        }
        while(idMethod !=0);      
    }    
    
}
