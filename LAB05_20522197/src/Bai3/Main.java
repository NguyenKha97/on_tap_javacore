/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) {
        NhanVienSanXuat a = new NhanVienSanXuat("12", "a b", 45);
        NhanVienSanXuat a1 = new NhanVienSanXuat("34", "c d", 4);
        NhanVienSanXuat a2 = new NhanVienSanXuat("56", "e f", 5);
        NhanVienVanPhong b = new NhanVienVanPhong("78", "g h", 12);
        NhanVienVanPhong b1 = new NhanVienVanPhong("910", "i j", 1);
        NhanVienVanPhong b2 = new NhanVienVanPhong("1112", "k l", 2);
        a.xuat();
        System.out.println("");
        b.xuat();
        System.out.println("");
        ArrayList<NhanVien> arr = new ArrayList<>();
        arr.add(a);
        arr.add(b);
        arr.add(a1);
        arr.add(b1);
        arr.add(a2);
        arr.add(b2);
        for(NhanVien i : arr){
            i.xuat();
            System.out.println("======================");
        }
    }
}
