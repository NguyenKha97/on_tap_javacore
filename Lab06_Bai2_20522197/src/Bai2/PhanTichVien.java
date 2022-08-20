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
public class PhanTichVien extends NhanVien{
    private int gioTC;
    private int phuCap;

    public PhanTichVien() {
        chucVu = "PTV";
        luongCB = 2000;
    }

    public PhanTichVien(String a, String b, int gioTC, int phuCap) {
        id = a;
        hoTen = b;
        chucVu = "PTV";
        luongCB = 2000;
        this.gioTC = gioTC;
        this.phuCap = phuCap;
        tinhLuong();
    }

    @Override
    protected void tinhLuong() {
        luong = (int)(luongCB*1.8);
    }

    @Override
    protected void nhap() {
        super.nhap();
        tinhLuong();
    }

    @Override
    protected void xuat() {
        super.xuat();
        
    }
    
    

    
}
