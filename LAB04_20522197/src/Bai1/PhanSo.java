/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class PhanSo {
    private int tuSo;
    private int mauSo;
    Scanner sc = new Scanner(System.in);
    
    public PhanSo() {}
    public PhanSo(int t, int m) {
        tuSo = t;
        mauSo = m;
    }
    
    public int getTu() {
        return tuSo;
    }
    public void setTu(int a) {
        tuSo = a;
    }
    public int getMau() {
        return mauSo;
    }

    public void setMau(int a) {
        mauSo = a;
    }
    
    public void nhap(){
        System.out.print("Nhap tu so: ");
        tuSo = sc.nextInt();
        System.out.print("Nhap mau so: ");
        mauSo = sc.nextInt();
    }
    
    public void xuat(){
    	if(mauSo==0)
    		System.out.print("Phan so khong ton tai");
    	else if(tuSo == 0)
    		System.out.print(0);
    	else if(mauSo == 1)
    		System.out.print(tuSo);
    	else if(tuSo*mauSo > 0)
    		System.out.print(Math.abs(tuSo) + "/" + Math.abs(mauSo));
    	else
    		if(tuSo<0)
    			System.out.print(tuSo + "/" + mauSo);
    		else
    			System.out.print(-tuSo + "/" + Math.abs(mauSo));
    }
    
    public PhanSo cong(PhanSo a){
        PhanSo x = new PhanSo();
        x.tuSo = tuSo*a.mauSo + a.tuSo*mauSo;
        x.mauSo = mauSo * a.mauSo;      
        return x;
    }
    
     public PhanSo tru(PhanSo a){
        PhanSo x = new PhanSo();
        x.tuSo = tuSo*a.mauSo - a.tuSo*mauSo;
        x.mauSo = mauSo * a.mauSo;      
        return x;
    }
    
     public PhanSo nhan(PhanSo a){
        PhanSo x = new PhanSo();
        x.tuSo = tuSo* a.tuSo;
        x.mauSo = mauSo * a.mauSo;      
        return x;
    }
    
     public PhanSo chia(PhanSo a){
        PhanSo x = new PhanSo();
        x.tuSo = tuSo* a.mauSo;
        x.mauSo = mauSo * a.tuSo;      
        return x;
    }
    
    public void rutGon() {
    	if(mauSo == 0) {
    		System.out.println("Phan so khong ton tai.");
    		return;
    	}
    	 int num1 = Math.abs(tuSo), num2 = Math.abs(mauSo);
         while (num1 != num2) {
             if(num1 > num2)
                 num1 = num1 - num2;
             else
                 num2 = num2 - num1;
         }
         tuSo/=num2;
         mauSo/=num2;
    }
    
     

}
