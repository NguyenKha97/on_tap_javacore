/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author admin
 */
public class Bai1 {
    
    static long tinhgt(int a){
        if(a==1)
            return 1;
        return a*tinhgt(a-1);
    }
    static double tinh(double x, int n){
        double kq=0;
        for(int i=1; i<=n; i++){
            kq+=(Math.pow(x, i)/tinhgt(i));
        }
        return kq;
    }
    
    public static void main(String[] args) {
        double kq1, kq2, kq3;
        kq1 = Math.round(tinh(5, 10)*1000)/1000.0;
        kq2 = Math.round(tinh(10, 12)*1000)/1000.0;
        kq3 = Math.round(tinh(15, 15)*1000)/1000.0;
        System.out.println(kq1);
        System.out.println(kq2);
        System.out.println(kq3);
    }
}
