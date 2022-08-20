/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("1. Nhap duong tron");
        DuongTron a = new DuongTron();
        a.nhap();
        System.out.println("2. Xuat duong tron");
        a.xuat();
        System.out.println("\n3. Chu vi duong tron = " + a.tinhChuVi());
        System.out.println("4. Dien tich duong tron = " + a.tinhDienTich());
        System.out.println("5. Kiem tra 2 duong tron");
        System.out.println("Nhap duong tron thu 2");
        DuongTron b = new DuongTron();
        b.nhap();
        a.xuat(); System.out.print(a.kiemTra(b)); b.xuat();
    }
}
