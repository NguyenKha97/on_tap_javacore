/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author admin
 */
public class QuanLyTienDien {
    private int soLuong;
    ArrayList<KhachHang> listKH = new ArrayList<>();

    public ArrayList<KhachHang> getListKH() {
        return listKH;
    }
    
    
    
    public QuanLyTienDien(){
        soLuong = 0;
    }
    
    protected void tinhTienDienPhuong() {
        for (KhachHang kh : listKH) {
            kh.tinhTienDien();
        }
    }
    
    protected KhachHang timKhachHang(int maKH) {
        for (KhachHang kh : listKH) {
            if (kh.getMaKH() == maKH) {
                return kh;
            }
        }
        return null;
    }
    
    protected double tbTienDien() {
        double kq = 0;
        for (KhachHang kh : listKH) {
            kq += kh.getTienDien();
        }
        return kq/listKH.size();
    }
    
    protected KhachHang timKhachHangTDMax() {
        double tienMax = listKH.get(0).getTienDien();
        for (KhachHang kh : listKH) {
            if (kh.getTienDien() > tienMax) {
                tienMax = kh.getTienDien();
            }
        }
        for (KhachHang kh : listKH) {
            if (kh.getTienDien() == tienMax) {
                return kh;
            }
        }
        return null;
    }
    
    protected ArrayList<KhachHang> sxTienDienMax() {
        List<SanXuat> listKHSX = new ArrayList<SanXuat>();
        ArrayList<KhachHang> listSXTDMax = new ArrayList<KhachHang>();
        for (KhachHang kh : this.listKH) {
            if (kh.getLoaiKH() == 3) {
                listKHSX.add((SanXuat) kh);
            }
        }
//        Collections.sort(listKHSX);
        double max = listKHSX.get(listKHSX.size() - 1).getTienDien();
        for (SanXuat sx : listKHSX) {
            if (sx.getTienDien() == max) {
                listSXTDMax.add(sx);
            }
        }
        return listSXTDMax;
    }
    
    protected void khoiTao(){
        soLuong = 7;
        KinhDoanh kd1 = new KinhDoanh(123, "A", 120, 960, 1.8);
        GiaDinh gd1 = new GiaDinh(124, "B", 400, 450);
        KinhDoanh kd2 = new KinhDoanh(125, "C", 300, 689, 1.3);
        SanXuat sx1 = new SanXuat(126, "D", 150, 965, 1.5);
        GiaDinh gd2 = new GiaDinh(127, "E", 500, 999);
        SanXuat sx2 = new SanXuat(128, "F", 350, 987, 1.6);
        SanXuat sx3 = new SanXuat(129, "G", 100, 989, 1.9);
        listKH.add(gd1);
        listKH.add(gd2);
        listKH.add(kd1);
        listKH.add(kd2);
        listKH.add(sx1);
        listKH.add(sx2);
        listKH.add(sx3);
    }
    
    
    
}
