/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class NhanVienSanXuat extends NhanVien {
    private int soSP;
    
    @Override
    protected void tinhLuong() {
        luong = 5300000 + 170000 * soSP;       
    }

    public NhanVienSanXuat() {
    }
    public NhanVienSanXuat(String a, String b, int c){
        id = a;
        hoTen = b;
        luongCanBan = 5300000;
        soSP = c;
        tinhLuong();
    }

    @Override
    protected void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap id nhan vien: ");
        id = sc.nextLine();
        System.out.print("Nhap ho ten nhan vien: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap so luong san pham: ");
        soSP = sc.nextInt();
    }

    @Override
    protected void xuat() {
        System.out.println("Id : " + id);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Luong co ban: " + luongCanBan);
        System.out.println("So san pham: " + soSP);
        System.out.println("Luong: " + luong);
    }
    
}
