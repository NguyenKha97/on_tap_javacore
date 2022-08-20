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
public class NhanVienKiemThu extends NhanVien {
    private int soLoi;

    public NhanVienKiemThu() {
        chucVu = "KT";
        luongCB = 3000;
    }

    public NhanVienKiemThu(String a, String b, int soLoi) {
        id = a;
        hoTen = b;
        chucVu = "KT";
        luongCB = 3000;
        this.soLoi = soLoi;
        tinhLuong();
    }

    
    @Override
    protected void tinhLuong() {
        luong = luongCB + soLoi*85000;
    }

    @Override
    protected void nhap() {
        super.nhap(); 
        System.out.println("Nhap so loi da phat hien: ");
        Scanner sc = new Scanner(System.in);
        soLoi = sc.nextInt();
        tinhLuong();
    }
    
    
    
    
    

    
}
