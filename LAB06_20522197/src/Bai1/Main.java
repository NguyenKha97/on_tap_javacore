/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author admin
 */
public class Main {
    static Scanner sc = new Scanner(System.in);

    static ArrayList<NhanVien> danhSach = new ArrayList<>(200);
    
    private static void nhapNV() {
        System.out.print("Chuc vu nhan vien (sx hay vp):");
        String temp = sc.nextLine();
        while(!temp.equalsIgnoreCase("sx") || !temp.equalsIgnoreCase("vp")){
            System.out.print("Ky tu nhap khong dung, vui long nhap lai chuc vu (sx hay vp): ");
            temp = sc.nextLine();
        }
        if(temp.equalsIgnoreCase("SX")){
            NhanVienSanXuat a = new NhanVienSanXuat();
            a.nhap();
            danhSach.add(a);
        }
        else {
            NhanVienVanPhong b = new NhanVienVanPhong();
            b.nhap();
            danhSach.add(b);
        }
            
    }
    private static void taoNV() {
        Random rand = new Random();
        System.out.println("Nhap so luong nhan vien can tao: ");
        int temp = sc.nextInt();
        while(danhSach.size()<=200 && temp>0){
            int cv = rand.nextInt(1, 10);
            if(cv%2==0){
                NhanVienSanXuat a = new NhanVienSanXuat();
                a.ngauNhien();
                danhSach.add(a);
            }
            else{
                NhanVienVanPhong b = new NhanVienVanPhong();
                b.ngauNhien();
                danhSach.add(b);
            }                
        }       
    }
    private static void xuatNV() {
        int i=0;
        while(danhSach.size()>i){
            danhSach.get(i).xuat();
            i++;
        }
    } 
    private static void luongNV() {
        System.out.print("Chuc vu nhan vien can cap nhat tien luong (sx hay vp):");
        String temp = sc.nextLine();
        while(!temp.equalsIgnoreCase("sx") || !temp.equalsIgnoreCase("vp")){
            System.out.print("Ky tu nhap khong dung, vui long nhap lai chuc vu (sx hay vp): ");
            temp = sc.nextLine();
        }
        System.out.print("Nhap luong can ban moi: ");
        int money = sc.nextInt(); int i =0;
        if(temp.equalsIgnoreCase("SX")){
            while(danhSach.size()>i){
                if(danhSach.get(i).getChucVu().equalsIgnoreCase(temp))
                    danhSach.get(i).setLuongCB(money);
                i++;
            }    
        }
        else {
            while(danhSach.size()>i){
                if(danhSach.get(i).getChucVu().equalsIgnoreCase(temp))
                    danhSach.get(i).setLuongCB(money);
                i++;
            }  
        }
    }
    
     private static void timNV() {
         System.out.print("Nhap ma nhan vien can tim: ");
         String id = sc.nextLine();
         int i=0;
         while(danhSach.size()>i){
            if(danhSach.get(i).getId().contentEquals(id)){
                System.out.println("Found!!!");
                danhSach.get(i).xuat();
                return;
            }
            i++;
        }
         System.out.println("Not found!");
     }
    
    private static void capNhatNV() {
        System.out.print("Nhap ma nhan vien can cap nhat: ");
         String id = sc.nextLine();
         int i=0;
         while(danhSach.size()>i){
            if(danhSach.get(i).getId().contentEquals(id)){
                System.out.println("Found!!!");
                danhSach.get(i).xuat();
                danhSach.remove(i);
                nhapNV();
                System.out.println("Done.");
                return;
            }
            i++;
        }
         System.out.println("Not found! khong the cap nhat.");    
    }    
    
    private static void nvLuongCao() {
        System.out.println("Nhan vien co luong cao nhat:");
        int i=0, max = danhSach.get(0).getLuong();
        while(danhSach.size()>i){
            if(danhSach.get(i).getLuong()>max)
                max = danhSach.get(i).getLuong();           
            i++;
        }
        i = 0;
        while(danhSach.size()>i){
            if(danhSach.get(i).getLuong()==max){
                danhSach.get(i).xuat();
            }
            i++;
        }      
    }
 
    private static void nvSPThapNhat() {
        System.out.println("Nhan vien co so san pham thap nhat:");
        int i = 0, min = 0;
        for(NhanVien j : danhSach){
            j.getChucVu().equalsIgnoreCase("sx");
            min = j.getHeSoL();
        }
        while(danhSach.size()>i){
            if(danhSach.get(i).getChucVu().equalsIgnoreCase("sx") )
                if(danhSach.get(i).getHeSoL()<min)
                    min = danhSach.get(i).getHeSoL();
            i++;
        }
        i = 0;
        while(danhSach.size()>i){
            if(danhSach.get(i).getChucVu().equalsIgnoreCase("sx") )
                if(danhSach.get(i).getHeSoL()==min)
                    danhSach.get(i).xuat();
            i++;
        }      
    }

    private static void top10nvSPNhieuNhat() {
        System.out.println("Top 10 nhan vien co so san pham thap nhat:");
        SortedSet<NhanVien> top = new TreeSet<>();
        for(NhanVien j : danhSach){
            j.getChucVu().equalsIgnoreCase("sx");
            top.add(j);
        }
        
    }
    
    public static void main(String[] args) {
        int choice;
        System.out.println("=====Quan ly nhan vien=====");
        do{
            System.out.println("Ma lenh\tChuc nang");
            System.out.println("1\tNhap nhan vien");
            System.out.println("2\tTao du lieu nhan vien");
            System.out.println("3\tXuat thong tin nhan vien");
            System.out.println("4\tTinh va cap nhat tien luong");
            System.out.println("5\tTim nhan vien theo ma nhan vien");
            System.out.println("6\tCap nhat nhan vien");
            System.out.println("7\tTim nhan vien luong cao nhat");
            System.out.println("8\tTim nhan vien co so san pham thao nhat");
            System.out.println("9\tTop 10 nhan vien co san pham nhieu nhat");
            System.out.print("Nhap ma lenh muon thuc hien hoac nhap 0 de thoat: ");
            choice = sc.nextInt();
            while(choice<0 || choice>9){
                System.out.print("Ma lenh khong hop le, moi nhap lai: ");
                choice = sc.nextInt();
            }
            switch(choice){
                case 1:
                    nhapNV();
                    break;
                case 2:
                    taoNV();
                    break;
                case 3:
                    xuatNV();
                    break;
                case 4:
                    luongNV();
                    break;
                case 5:
                    timNV();
                    break;
                case 6:
                    capNhatNV();
                    break;
                case 7:
                    nvLuongCao();
                    break;
                case 8:
                    nvSPThapNhat();
                    break;
                case 9:
                    top10nvSPNhieuNhat();            
            }
        }
        while (choice != 0);
              
    }    
 
}
