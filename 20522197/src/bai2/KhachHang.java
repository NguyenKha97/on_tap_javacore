/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author admin
 */
public abstract class KhachHang {
    protected int maKH;
    protected String ten;
    protected int chiSoCu;
    protected int chiSoMoi;
    protected int chiSoSD;
    protected double tienDien;
    protected int loaiKH;

    public int getMaKH() {
        return maKH;
    }

    public String getTen() {
        return ten;
    }

    public double getTienDien() {
        return tienDien;
    }

    public int getLoaiKH() {
        return loaiKH;
    }
    
    
    
    
    protected abstract void tinhChiSo();
    
    protected abstract void tinhTienDien();

    
}
