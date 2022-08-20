/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Nhap hon so tu bam phim");
        HonSo a = new HonSo(); a.nhap();
        System.out.println("2. Tao hon so tu dong");
        HonSo b = new HonSo(2,3,4);
        System.out.println("3. Xuat hon so");
        System.out.print("Nhap tu ban phim: "); a.xuat();
        System.out.print("\nPhuong phap tu dong: "); b.xuat();
        System.out.println("\n4 Phan so sang hon so");
        PhanSo c = new PhanSo();
        c.nhap();
        HonSo d = new HonSo();
        d.chuyenHonSo(c);
        c.xuat(); System.out.print(" => "); d.xuat();
        System.out.println("\n5. hon so sang phan so");
        c = d.chuyenPhanSo();
        d.xuat(); System.out.print(" => "); c.xuat();
        System.out.println("\n6. Cac phep toan");
        a.xuat(); System.out.print(" + "); b.xuat(); System.out.print(" = "); a.cong(b).xuat(); System.out.println("");
        a.xuat(); System.out.print(" - "); b.xuat(); System.out.print(" = "); a.tru(b).xuat(); System.out.println("");
        a.xuat(); System.out.print(" * "); b.xuat(); System.out.print(" = "); a.nhan(b).xuat(); System.out.println("");
        a.xuat(); System.out.print(" / "); b.xuat(); System.out.print(" = "); a.chia(b).xuat();
        System.out.println("\n7. So sanh");
        a.xuat(); System.out.print(" " + a.sosanh(b) + " "); b.xuat(); System.out.println("");
        
        
    }
}
