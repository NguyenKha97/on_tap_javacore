package Bai4;

public class Main {
	public static void main(String[] args) {
		TamGiac a = new TamGiac();
		a.nhap();
		a.xuat();
		if(a.laTamGiac())
			System.out.println("Chu vi = " + a.tinhChuVi() + " , dien tich = " + a.tinhDienTich());
		
	}
}
