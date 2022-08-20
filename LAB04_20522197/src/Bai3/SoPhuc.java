package Bai3;

import java.util.Scanner;

public class SoPhuc {
	private float thuc;
	private float ao;
	
	public SoPhuc(float thuc, float ao) {
		this.thuc = thuc;
		this.ao = ao;
	}
	public SoPhuc() {
		// TODO Auto-generated constructor stub
	}
	float getThuc() {
		return thuc;
	}
	void setThuc(float thuc) {
		this.thuc = thuc;
	}
	float getAo() {
		return ao;
	}
	void setAo(float ao) {
		this.ao = ao;
	}
	
	void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap phan thuc: ");
		float temp = sc.nextFloat();
		thuc = temp;
		System.out.print("Nhap phan ao: ");
		temp = sc.nextFloat();
		ao = temp;
	}
	
	void xuat() {
		System.out.print(thuc + " + " + ao + "i");
	}
	SoPhuc cong(SoPhuc a) {
		SoPhuc b = new SoPhuc(thuc+a.getThuc(), ao+a.getAo());
		return b;
	}
	
	SoPhuc tru(SoPhuc a) {
		SoPhuc b = new SoPhuc(thuc-a.getThuc(), ao-a.getAo());
		return b;
	}
	SoPhuc nhan(SoPhuc a) {
		SoPhuc b = new SoPhuc(thuc*a.getThuc()-ao*a.getAo(),thuc*a.getAo()+ao*a.getThuc());
		return b;
	}
	SoPhuc chia(SoPhuc b) {
		SoPhuc a = new SoPhuc((thuc*b.getThuc()+ao*b.getAo())/((float)Math.pow(b.getThuc(), 2)+(float)Math.pow(b.getAo(), 2)), (b.getThuc()*ao - thuc*b.getAo())/((float)Math.pow(b.getThuc(), 2)+(float)Math.pow(b.getAo(), 2)));
		return a;
	}
	
}
