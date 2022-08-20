/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author admin
 */
public class GiaDinh extends KhachHang{

    public GiaDinh() {
        maKH = 0;
        ten = "";
        chiSoCu = chiSoMoi = 0;
        loaiKH = 1;
    }
    
    public GiaDinh(int a, String ten, int b, int c) {
        maKH = a;
        this.ten = ten;
        chiSoCu = b;
        chiSoMoi = c;
        loaiKH = 1;
    }
    
    @Override
    protected void tinhChiSo() {
       chiSoSD = chiSoMoi - chiSoCu;
    }

    @Override
    protected void tinhTienDien() {
       if(chiSoSD>100)
           tienDien = chiSoSD *5.500;
       else
           tienDien = chiSoSD *3.500;
    }
    
}
