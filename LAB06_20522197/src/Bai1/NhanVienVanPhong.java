/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class NhanVienVanPhong extends NhanVien {
    private int soNL;
    
    public NhanVienVanPhong() {
//       id = "";
//       hoTen = "";
//       soSP = luong = 0;
       luongCB = 4500000; 
       chucVu = "VP";
    }

    public NhanVienVanPhong(String a, String b, int soNL) {
        this.soNL = soNL;
        a = id;
        b = hoTen;
        luongCB = 5300000;     
        chucVu = "VP";
        luong = soNL*220000 + luongCB;
    }

    @Override
    void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so ngay lam: ");
        soNL = sc.nextInt();
        luong = soNL*170000 + luongCB;
    }


    @Override
    void xuat() {
        super.xuat(); 
        System.out.println("So ngay lam: " + soNL);
        System.out.println("Luong: " + luong);
    }

    @Override
    void setLuongCB(int a) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    void ngauNhien() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    String getChucVu() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    String getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    int getLuong() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    int getHeSoL() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
