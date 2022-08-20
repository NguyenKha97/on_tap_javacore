/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bai1;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class HonSo extends PhanSo{
    private int phanNguyen;
    
    public HonSo() {}
    public HonSo(int a, int b, int c) {
        super(b, c);
        phanNguyen = a;              
    }

    public int getPhanNguyen() {
        return phanNguyen;
    }

    public void setPhanNguyen(int phanNguyen) {
        this.phanNguyen = phanNguyen;
    }
    

    @Override
    public int getMau() {
        return super.getMau(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setMau(int a) {
        super.setMau(a); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int getTu() {
        return super.getTu(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setTu(int a) {
        super.setTu(a); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap phan nguyen: ");
        phanNguyen = sc.nextInt();
        super.nhap(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody      
    }

    @Override
    public void xuat() {
//        System.out.println(phanNguyen + "|" + getTu() + "/" + getMau());
        System.out.print(phanNguyen + "|"); super.xuat();
        
    }
    
    public void chuyenHonSo (PhanSo a){
        if(a.getTu() <= a.getMau()){
            setTu(a.getTu());
            setMau(a.getMau());
            phanNguyen = 0;
        }
        else {
            phanNguyen = a.getTu()/a.getMau();
            setTu(a.getTu()%a.getMau());
            setMau(a.getMau());
        }   
    }
    public PhanSo chuyenPhanSo (){
        PhanSo a = new PhanSo(phanNguyen*getMau()+getTu(), getMau());
        return a;
    }
    
    public HonSo cong (HonSo x){
        HonSo temp = new HonSo();
        PhanSo a = new PhanSo();
        PhanSo b = new PhanSo();
        a = chuyenPhanSo();
        b = x.chuyenPhanSo();
        a = a.cong(b);
        temp.chuyenHonSo(a);
        return temp;
    }
    
    public HonSo tru (HonSo x){
        HonSo temp = new HonSo();
        PhanSo a = new PhanSo();
        PhanSo b = new PhanSo();
        a = chuyenPhanSo();
        b = x.chuyenPhanSo();
        a = a.tru(b);
        temp.chuyenHonSo(a);
        return temp;
    }

    public HonSo nhan (HonSo x){
        HonSo temp = new HonSo();
        PhanSo a = new PhanSo();
        PhanSo b = new PhanSo();
        a = chuyenPhanSo();
        b = x.chuyenPhanSo();
        a = a.nhan(b);
        temp.chuyenHonSo(a);
        return temp;
    }
    
    public HonSo chia (HonSo x){
        HonSo temp = new HonSo();
        PhanSo a = new PhanSo();
        PhanSo b = new PhanSo();
        a = chuyenPhanSo();
        b = x.chuyenPhanSo();
        a = a.chia(b);
        temp.chuyenHonSo(a);
        return temp;
    }
    
    public char sosanh (HonSo x){
        HonSo temp = new HonSo();
        PhanSo a = new PhanSo();
        PhanSo b = new PhanSo();
        a = chuyenPhanSo();
        b = x.chuyenPhanSo();
        int t = a.getTu()*b.getMau();
        int y = b.getTu()*a.getMau();
        return (t==y) ? ('=') : ((t<y)? ('<'):('>'));
    }
    
    
    
            
    
    
    
    
}
