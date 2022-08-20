package Bai4;

import java.util.Scanner;

public class TamGiac {
	private float canh1;
	private float canh2;
	private float canh3;
	
	TamGiac () {}
	TamGiac(float a, float b, float c) {
		canh1 = a;
		canh2 = b;
		canh3 = c;
	}
	
	float getCanh1() {
		return canh1;
	}
	void setCanh1(float canh1) {
		this.canh1 = canh1;
	}
	float getCanh2() {
		return canh2;
	}
	void setCanh2(float canh2) {
		this.canh2 = canh2;
	}
	float getCanh3() {
		return canh3;
	}
	void setCanh3(float canh3) {
		this.canh3 = canh3;
	}
	
	void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap do dai canh thu nhat: ");
		canh1 = sc.nextFloat();
		System.out.print("Nhap do dai canh thu hai: ");
		canh2 = sc.nextFloat();
		System.out.print("Nhap do dai canh thu ba: ");
		canh3 = sc.nextFloat();
	}
	
	boolean laTamGiac() {
		return (canh1 < 0 || canh2 < 0 || canh3 < 0 || canh1 >= canh2 + canh3 || canh2 >= canh1 + canh3 || canh3 >= canh1 + canh2) ? false : true;
	}
	
	String loaiTamGiac() {
		if(!laTamGiac())
			return " không tạo thành tam giác";
		else {
			if ((canh1 == canh2) && (canh2 == canh3)) {
                return("tam giác đều");
            } else if ((canh1 == canh2) || (canh1 == canh3) || (canh2 == canh3)) {
                return("tam giác cân");
            } else if ((canh1 * canh1 == canh2 * canh2 + canh3 * canh3) ||
                    (canh2 * canh2 == canh1 * canh1 + canh3 * canh3) ||
                    (canh3 * canh3 == canh1 * canh1 + canh2 * canh2)) {
                return("tam giác vuông");
            } else if (((canh1 * canh1 + canh2 * canh2 == canh3 * canh3) && (canh1 == canh2)) ||
                    ((canh1 * canh1 + canh3 * canh3 == canh2 * canh2) && (canh1 == canh3)) ||
                    ((canh2 * canh2 + canh3 * canh3 == canh1 * canh1) && (canh2 == canh3))) {
                return("tam giác vuông cân");
            } else {
                return("tam giác thường");
            }
		}
	}
	void xuat() {
		if(!laTamGiac())
			System.out.println("Ba cạnh " + canh1 + ", " + canh2 + ", " + canh3 + loaiTamGiac());
		else
			System.out.println("Ba cạnh " + canh1 + ", " + canh2 + ", " + canh3 + " tạo thành " + loaiTamGiac());
	}
	
	float tinhChuVi() {
		return canh1 + canh2 + canh3;
	}
	float tinhDienTich() {
		float p = tinhChuVi()/2.0f;
		return (float)Math.sqrt(p * (p-canh1) * (p-canh2) * (p-canh3));
	}
}
