/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab03_20522197;

import java.util.Scanner;



public class Bai4 {
    private static final Scanner SC = new Scanner(System.in);
    
    public static double tinhCanBacX(int n) {
        System.out.print("Nhap can bac x cua n: ");
        float x = SC.nextFloat();
        x = 1/x;
        System.out.println("kq = " + Math.pow(n, x) );
        return Math.pow(n, x);
    }
    
    public static long inSoDao(int n) {
        long soDao = 0;
        while(n /10 !=0 || n%10 != 0) {
            soDao*=10;
            soDao+=n%10;
            n/=10;
        }
        System.out.println("kq = " + soDao);
        return soDao;
    }
    
    public static boolean kiemTraChinhPhuong(int n) {
        for(int i = 1; i<=(int)Math.sqrt(n); i++)
            if((int)Math.pow(i, 2) == n){
                System.out.println(true);
                return true;
            }
        System.out.println(false);
        return false;
    }
    
    public static boolean kiemTraNguyenTo(int n) {
        boolean result = true;
        for(int i = 2; i<n; i++)
            if(n%i==0){
                result = false;
            }
        System.out.println(result);
        return result;
    }
   
    public static long tichSoLe(int n) {
        long result = 1;
        while(n/10 !=0 || n%10 !=0) {
            if((n%10) % 2 !=0 && n !=0 )
                result*=(n%10);
            n/=10;
        }
        if(result == 0) {
            System.out.println("n ko co so le.");
            return result=0;
        }
        System.out.println(result);
        return result;
    }
    
    public static long tongNguyenTo(int n) {
        long result = 0;
        for (int i = 1; i < n; i++) {
            if(kiemTraNguyenTo(i))
                result+=i;
        }
        if (result == 0)
            System.out.println("Khong co so nguyen to nho hon n.");       
        System.out.println(result);
        return result;
    }
    
    public static long tongChinhPhuong(int n) {
        long result = 0;
        for (int i = 1; i < n; i++) {
            if (kiemTraChinhPhuong(i)) {
                result += i;
            }
        }
        if (result == 0) 
            System.out.println("Khong co so chinh phuong nho hon n.");
        System.out.println(result);
        return result;
    }
    
    public static long tongUocDuong(int n) {
        long result = 0;
        for(int i=1; i<=n; i++)
            if(n % i ==0)
                result+=i;
        System.out.println(result);
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
        System.out.println("  1\tTinh can bac x cua n");
        System.out.println("  2\tIn so dao");
        System.out.println("  3\tKiem tra n co la so chinh phuong");
        System.out.println("  4\tKiem tra n co la so nguyen to");
        System.out.println("  5\tTinh tich cac so le cua n");
        System.out.println("  6\tTinh tong cac so nguyen to nho hon n");
        System.out.println("  7\tTinh tong cac so chinh phuong nho hon n");
        System.out.println("  8\tTinh tong cac uoc duong cua n");
        System.out.print("Nhap ma phuong thuc muon thuc hien: ");
        int idMethod = SC.nextInt();
        long temp1; double temp2; boolean temp3;
        do{
        while(idMethod <1 || idMethod>8) {
            System.out.print("Khong co phuong thuc nay, moi nhap lai: ");
            idMethod = SC.nextInt();
        }   
        switch(idMethod) {
            case 1 -> temp2 = tinhCanBacX(n);
            case 2 -> temp1 = inSoDao(n);
            case 3 -> temp3 = kiemTraChinhPhuong(n);
            case 4 -> temp3 = kiemTraNguyenTo(n);
            case 5 -> temp1 = tichSoLe(n);
            case 6 -> temp1 = tongNguyenTo(n);
            case 7 -> temp1 = tongChinhPhuong(n);
            case 8 -> temp1 = tongUocDuong(n);
           
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
