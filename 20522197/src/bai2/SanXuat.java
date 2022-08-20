/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author admin
 */
public class SanXuat extends KhachHang{
    private double heSoSD;

    public SanXuat() {
        maKH = 0;
        ten = "";
        chiSoCu = chiSoMoi = 0;
        loaiKH = 3;
    }
    
    public SanXuat(int a, String ten, int b, int c, double d) {
        maKH = a;
        this.ten = ten;
        chiSoCu = b;
        chiSoMoi = c;
        loaiKH = 3;
        heSoSD = d;
    }

     @Override
    protected void tinhChiSo() {
       chiSoSD = chiSoMoi - chiSoCu;
    }

    @Override
    protected void tinhTienDien() {
        tienDien = chiSoSD * 7.000 * heSoSD;
    }
    
}
