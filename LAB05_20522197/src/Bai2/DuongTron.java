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
public class DuongTron extends ToaDo{
    private float r;

    DuongTron() {
    }

    DuongTron(float r, float h, float t) {
        super(h, t);
        this.r = r;
    }

    float getR() {
        return r;
    }

    void setR(float r) {
        this.r = r;
    }
    
    @Override
    void nhap() {
    super.nhap();
        System.out.print("Nhap do dai ban kinh r: ");
        Scanner sc = new Scanner(System.in);
        r = sc.nextFloat();       
    }
    
    @Override
    void xuat(){
        System.out.print("Duong tron tam "); super.xuat(); System.out.print(", ban kinh r = " + r);
    }
    
    float tinhChuVi(){
        return(r*2*3.14f);
    }
    float tinhDienTich() {
        return (float)(Math.pow(r, 2)*3.14);
    }
    String kiemTra(DuongTron a) {
        float khoangCachTam = tinhKhoangCach(a);
        float hieuR = Math.abs(r - a.getR());
        float tongR = Math.abs(r + a.getR());
        if(khoangCachTam == hieuR)
            return " tiep xuc trong ";
        else if(khoangCachTam == tongR)
            return "tiep xuc ngoai";
        else if(khoangCachTam>hieuR && khoangCachTam<tongR)
            return " giao ";
        else
            return " khong giao ";
    }
}
