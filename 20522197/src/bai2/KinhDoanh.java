/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author admin
 */
public class KinhDoanh extends KhachHang{
    private double heSoSD;

    public KinhDoanh() {
        maKH = 0;
        ten = "";
        chiSoCu = chiSoMoi = 0;
        loaiKH = 2;
    }
    
    public KinhDoanh(int a, String ten, int b, int c, double d) {
        maKH = a;
        this.ten = ten;
        chiSoCu = b;
        chiSoMoi = c;
        loaiKH = 2;
        heSoSD = d;
    }
    
    @Override
    protected void tinhChiSo() {
       chiSoSD = chiSoMoi - chiSoCu;
    }

    @Override
    protected void tinhTienDien() {
       if(chiSoSD>500)
           tienDien = chiSoSD *7.000*heSoSD;
       else
           tienDien = chiSoSD *5.500+heSoSD;
    }
    
    
}
