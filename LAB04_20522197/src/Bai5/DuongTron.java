package Bai5;

import java.util.Scanner;

import Bai2.ToaDo;

public class DuongTron {
	ToaDo tam;
	float r;
	
	public DuongTron() {}
	public DuongTron(float a, float b, float  c) {
		tam = new ToaDo(a, b);
		r = c;
	}
	
	public void nhap() {
		tam.nhap();
		System.out.print("Nhap ban kinh r: ");
		Scanner sc = new Scanner(System.in);
		r = sc.nextFloat();
	}
	
	public void xuat() {
		System.out.println("Toa do tam (" + tam.layHoanhDo() + ", " + tam.layTungDo() + ")");
		System.out.println("Ban kinh r = " + r);
	}
	
	public float tinhChuVi() {
		return r*2*3.14f;
	}
	public float tinhDienTich() {
		return (float)Math.pow(r, 2) * 3.14f;
	}
	public void phongTo(float x) {
		r = r * (1.0f + x/100);
	}
	public void thuNho(float x) {
		r = r * (1.0f - x/100);
	}
	
	boolean giaoNhau(DuongTron e) {
		float khoangCachTam = tam.tinhKhoangCach(e.tam);
		return (khoangCachTam < Math.abs(r - e.r) || khoangCachTam > (r + e.r)) ? false : true;
	}
}
