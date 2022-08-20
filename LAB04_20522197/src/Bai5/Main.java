package Bai5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuongTron s = new DuongTron(0, 0, 4);
		s.xuat();
		System.out.println("Chu vi = " + s.tinhChuVi() + " dien tich = " + s.tinhDienTich());
		DuongTron s1 = new DuongTron(0, 3, 1f);
		System.out.println(s1.giaoNhau(s)); //kiem tra giao nhau
		s.phongTo(35.6f);
		s.xuat();
		s.thuNho(35.6f);
		s.xuat();

		
	}

}
