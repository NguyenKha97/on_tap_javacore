/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bai1;
    
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Main {
    
    public static int taoSoNN() {
        Random generator = new Random();
        int temp = generator.nextInt();
        while(temp == 0) {
            temp = generator.nextInt();
        }
        return temp;
    }
    
    public static void taoPS(PhanSo a) {
        a.setTu(taoSoNN());
        a.setMau(taoSoNN());
        System.out.println("Done");
    }
    
    public static void tinhToan(PhanSo a, PhanSo b) {
        b.nhap();
        PhanSo c = new PhanSo();
        c = a.cong(b);
        a.xuat(); System.out.print(" + "); b.xuat(); System.out.print(" = "); c.xuat(); System.out.println("");
        c = a.tru(b);
        a.xuat(); System.out.print(" - "); b.xuat(); System.out.print(" = "); c.xuat(); System.out.println("");
        c = a.nhan(b);
        a.xuat(); System.out.print(" * "); b.xuat(); System.out.print(" = "); c.xuat(); System.out.println("");
        c = a.chia(b);
        a.xuat(); System.out.print(" / "); b.xuat(); System.out.print(" = "); c.xuat(); System.out.println("");
    }
    
    public static void gan(PhanSo a, PhanSo b) {
        System.out.println("Nhap gia tri phan so can gan");
        b.nhap();
        a = new PhanSo(b.getTu(),b.getMau());
        System.out.println("Phan so vua dc gan co gia tri la: "); a.xuat(); System.out.println("");
    }

    private static Scanner SC = new Scanner(System.in);
    public static void main(String[] args) {   	
        PhanSo a = new PhanSo();
        PhanSo b = new PhanSo();   
        System.out.println("Menu lua chon phuong thuc:");
        System.out.println("Ma PT\tTen phuong thuc");
        System.out.println("  1\tNhap phan so");
        System.out.println("  2\tTao phan so ngau nhien");
        System.out.println("  3\tXuat cac phan so");
        System.out.println("  4\tCong tru nhan chia phan so");
        System.out.println("  5\tGan phan so");
        System.out.println("  6\tRut gon phan so");
        System.out.print("Nhap ma phuong thuc muon thuc hien: "); 
        int idMethod = SC.nextInt();
        do{
            while(idMethod <1 || idMethod>6) {
                System.out.print("Khong co phuong thuc nay, moi nhap lai: ");
                idMethod = SC.nextInt();
            }
        switch(idMethod) {
            case 1 -> a.nhap();
            case 2 -> taoPS(a);
            case 3 -> {a.xuat();System.out.println();}
            case 4 -> tinhToan(a, b);
            case 5 -> gan(a,b);
            case 6 -> {a.nhap();a.rutGon();a.xuat();}
        }
        System.out.print("Nhap ma phuong thuc neu ban muon thuc hien phuong thuc tiep theo, nhap 0 de thoat: ");
        idMethod = SC.nextInt();
        }
        while(idMethod !=0);    
        System.out.println("Thoat chuong trinh.");
    }
    
}
