package Bai2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ToaDo a = new ToaDo();
		a.nhap();
		a.xuat();
		System.out.println("Diem vua nhap co hoanh do = " + a.layHoanhDo());
		System.out.println("Diem vua nhap co tung do = " + a.layTungDo());
		System.out.print("Nhap tung do moi: ");
		Scanner sc = new Scanner(System.in);
		float temp = sc.nextFloat();
		a.datTungDo(temp);
		a.xuat();
		System.out.print("Nhap hoanh do moi: ");
		temp = sc.nextFloat();
		a.datHoanhDo(temp);
		a.xuat();
		a.diChuyenToaDo(0, 0);
		a.xuat();
		ToaDo b = new ToaDo(3,4);
		System.out.println("Khoang cach = " + a.tinhKhoangCach(b));
		System.out.println("Trung diem ");a.trungDiem(b).xuat();
		b.copy(a);
		b.xuat();
		
	}
	
}
