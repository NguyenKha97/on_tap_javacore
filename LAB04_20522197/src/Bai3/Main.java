package Bai3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SoPhuc a = new SoPhuc();
		a.nhap();
		System.out.print("So ao vua nhap la "); a.xuat();System.out.println();
		SoPhuc b = new SoPhuc(1, 1);
		System.out.print("+\t"); a.cong(b).xuat(); System.out.println();
		System.out.print("-\t"); a.tru(b).xuat(); System.out.println();
		System.out.print("*\t"); a.nhan(b).xuat(); System.out.println();
		System.out.print("/\t"); a.chia(b).xuat(); System.out.println();
		
	}

}
