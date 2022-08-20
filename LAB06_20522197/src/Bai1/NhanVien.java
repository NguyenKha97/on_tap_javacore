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
public abstract class NhanVien {
    protected String id;
    protected String hoTen;
    protected int luongCB;
    protected int luong;
    protected String chucVu;
    
    abstract void setLuongCB(int a);
    abstract void ngauNhien();
    abstract String getChucVu();
    abstract String getId();
    abstract int getLuong();
    abstract int getHeSoL();
    void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma nhan vien: ");
        id = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
    };
    void xuat(){
        System.out.println("Ma nhan vien: " + id);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Chuc vu: " + chucVu);
        System.out.println("Luong can ban: " + luongCB);
    };
    
}
