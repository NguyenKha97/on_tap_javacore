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
public class NhanVienVanPhong extends NhanVien{
    private int ngayLam;

    @Override
    protected void tinhLuong() {
        luong = 4500000 + 220000 * ngayLam;
    }

    public NhanVienVanPhong() {
    }

    public NhanVienVanPhong(String a, String b, int c) {
        id = a;
        hoTen = b;
        luongCanBan = 4500000;
        ngayLam = c;
        tinhLuong();
    }

    @Override
    protected void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap id nhan vien: ");
        id = sc.nextLine();
        System.out.print("Nhap ho ten nhan vien: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap so ngay lam viec: ");
        ngayLam = sc.nextInt();
    }

    @Override
    protected void xuat() {
        System.out.println("Id : " + id);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Luong co ban: " + luongCanBan);
        System.out.println("So ngay lam viec: " + ngayLam);
        System.out.println("Luong: " + luong);
    }
    
}
