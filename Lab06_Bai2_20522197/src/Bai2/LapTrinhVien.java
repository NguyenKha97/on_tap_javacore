/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class LapTrinhVien extends NhanVien
{
    private int gioTC;

    public LapTrinhVien() {
        chucVu = "LTV";
        luongCB = 1000;
    }

    public LapTrinhVien(String a, String b, int gioTC) {
        id = a;
        hoTen = b;
        this.gioTC = gioTC;
        chucVu = "LTV";
        luongCB = 1000;
        tinhLuong();
    }

    @Override
    protected void tinhLuong() {
        luong = luongCB + gioTC*250000;
    }

    @Override
    protected void nhap() {
        super.nhap();
        System.out.print("Nhap so gio tang ca: ");
        Scanner sc = new Scanner(System.in);
        gioTC = sc.nextInt();
        tinhLuong();
    }

    @Override
    protected void xuat() {
        super.xuat();
    }
    
    
    
    
    


    
}
