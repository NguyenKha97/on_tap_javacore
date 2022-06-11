/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB01_20522197;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Bai17 {
    public static int function(String s) {
        int n = s.length(), flag = n, x =0;
        char[] c = new char[n];
        c = s.toCharArray();
        for(int i=0; i<n ; i++) {
            if(flag > 1 && i!=0){
                 x *=10;
                 flag--;
            }
            x += ((int)c[i]-48);    
        }
        return x;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap gio phut giay theo format __h__p__s: ");
        String t = sc.next(), temp = t;
        t = t.replace('p', 'h');
        t = t.replace('s', 'h');
        String[] a = new String[3];
        a = t.split("h");
        int h , m , s ;
   
        h = function( a[0]);
        m = function( a[1]);
        s = function( a[2]);
        
//        System.out.println(h);
//        System.out.println(m);
//        System.out.println(s);
        
        System.out.println(temp + " = " + (h*3600 + m * 60 + s) + " giay");
        
    }
}
