/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02_20522197;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Bai5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a, b, c cach nhau 1 khoang trang: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.print("PT: ");
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("0x^2 + 0x + 0 = 0\n=> Pt co nghiem dung voi moi x");
                } else {
                    System.out.println("0x^2 + 0x + " + c + " = 0\n=> Pt vo nghiem");
                }
            } else if (b == 1) {
                if (c == 0) {
                    System.out.println("0x^2 + x + 0 = 0\n<=> x = 0\n=>Pt co 1 nghiem x = 0");
                } else {
                    System.out.println("0x^2 + x + " + c + " = 0\n<=> x + " + c + " = 0\n=>Pt co 1 nghiem x = " + -c);
                }
            } else {
                if (c == 0) {
                    System.out.println("0x^2 + " + b + "x + 0 = 0\n<=>" + b + "x = 0\n=> Pt co 1 nghiem x = 0");
                } else {
                    System.out.println("0x^2 + " + b + "x + " + c + " = 0\n<=>" + b + "x + " + c + " = 0\n=>Pt co 1 nghiem x = " + (double) -c / b + " hay x = " + -c + "/" + b);
                }
            }
        } else {
            if (a == 1) {
                if (b == 0) {
                    if (c == 0) {
                        System.out.println("x^2 = 0");
                    } else {
                        System.out.println("x^2 + " + c + " = 0");
                    }
                } else if (b == 1) {
                    if (c == 0) {
                        System.out.println("x^2 + x = 0");
                    } else {
                        System.out.println("x^2 + x + " + c + " = 0");
                    }
                } else {
                    if (c == 0) {
                        System.out.println("x^2 + " + b + "x = 0");
                    } else {
                        System.out.println("x^2 + " + b + "x + " + c + " = 0");
                    }
                }
            } else {
                if (b == 0) {
                    if (c == 0) {
                        System.out.println(a + "x^2 = 0");
                    } else {
                        System.out.println(a + "x^2 + " + c + " = 0");
                    }
                } else if (b == 1) {
                    if (c == 0) {
                        System.out.println(a + "x^2 + x = 0");
                    } else {
                        System.out.println(a + "x^2 + x + " + c + " = 0");
                    }
                } else {
                    if (c == 0) {
                        System.out.println(a + "x^2 + " + b + "x = 0");
                    } else {
                        System.out.println(a + "x^2 + " + b + "x + " + c + " = 0");
                    }
                }
            }
            double delta = Math.pow(b, 2) - 4*a*c;
            if(delta < 0)
                System.out.println("Delta = " + delta + " < 0\n=> Pt vo nghiem");
            else if(delta==0)
                System.out.println("Delta = " + delta + " = 0\n=> Pt co 1 nghiem kep x = "  + (double)-b/(2*a));
            else{
                System.out.println("Delta = " + delta + " > 0\n=> Pt co 2 nghiem phan biet");
                System.out.println("x1 = "+ ((double)-b + Math.sqrt(delta))/(2*a) + "\nx2 = " + ((double)-b - Math.sqrt(delta))/(2*a));
            }        
        }
    }
}
