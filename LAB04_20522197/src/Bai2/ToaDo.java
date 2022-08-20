package Bai2;

import java.util.Scanner;

public class ToaDo {
	private float hoanhDo;
	private float tungDo;
	
	public ToaDo() {}
	public ToaDo(float h,float t) {
		hoanhDo = h;
		tungDo = t;
	}
	public float layTungDo() {
		return tungDo;
	}
	public void datTungDo(float x) {
		tungDo = x;
	}
	
	public float layHoanhDo() {
		return hoanhDo;
	}
	public void datHoanhDo(float x) {
		hoanhDo = x;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap tung do: ");
		tungDo = sc.nextFloat();
		System.out.print("Nhap hoanh do: ");
		hoanhDo = sc.nextFloat();
		
		}
	public void xuat() {
		System.out.print("Diem co toa do: (" + hoanhDo + ", " + tungDo + ")\n");
	}
	
	
	
	public void diChuyenToaDo(float x, float y) {
		hoanhDo = x;
		tungDo = y;
	}
	
	public float tinhKhoangCach(ToaDo b) {
		return (float)Math.sqrt((Math.pow((b.hoanhDo-hoanhDo), 2)) + (Math.pow((b.tungDo-tungDo), 2)) );
	}
	
	public ToaDo trungDiem(ToaDo b) {
		ToaDo x = new ToaDo((hoanhDo+b.hoanhDo)/2, (tungDo+b.tungDo)/2);
		return x;
	}

	
	public void copy(ToaDo a) {
		hoanhDo = a.hoanhDo;
		tungDo = a.tungDo;
	}
	

}
