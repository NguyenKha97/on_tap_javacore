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
public abstract class NhanVien {
    protected String id;
    protected String hoTen;
    protected int luongCB;
    protected int luong;
    protected String chucVu;
    
    protected abstract void tinhLuong();
    protected void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma nhan vien: ");
        id = sc.nextLine();
        System.out.println("Nhap ho ten: ");
        hoTen = sc.nextLine();
        
    }
    protected void xuat() {
        System.out.println("Ma nhan vien: " + id);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Luong: "+ luong);
    }
    
    
}
