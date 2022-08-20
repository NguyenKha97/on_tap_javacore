package Bai1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class NhanVienSanXuat extends NhanVien{

    private int soSP;
    

    public NhanVienSanXuat() {
       id = "";
       hoTen = "";
       soSP = luong = 0;
       luongCB = 5300000; 
       chucVu = "SX";
    }

    public NhanVienSanXuat(String a, String b, int soSP) {
        this.soSP = soSP;
        a = id;
        b = hoTen;
        luongCB = 5300000;     
        chucVu = "SX";
        luong = soSP*170000 + luongCB;
    }

    @Override
    void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so san pham: ");
        soSP = sc.nextInt();
        luong = soSP*170000 + luongCB;
    }


    @Override
    void xuat() {
        super.xuat(); 
        System.out.println("So luong san pham: " + soSP);
        System.out.println("Luong: " + luong);
    }

    @Override
    void ngauNhien() {
        Random rand = new Random();
        
    }

    @Override
    void setLuongCB(int a) {
        luongCB = a;
        luong = soSP*170000 + luongCB;
    }

    @Override
    String getChucVu() {
        return chucVu;
    }

    @Override
    String getId() {
        return id;
    }

    @Override
    int getLuong() {
        return luong;
    }
    
    @Override
    int getHeSoL() {
        return soSP;
    }
        

    }



    
    
    
    
