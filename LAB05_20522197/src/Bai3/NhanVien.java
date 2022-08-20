/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

/**
 *
 * @author admin
 */
public abstract class NhanVien {
    protected String id;
    protected String hoTen;
    protected int luongCanBan;
    protected int luong;
    
    protected abstract void tinhLuong();
    protected abstract void nhap();
    protected abstract void xuat();
    
    

}
