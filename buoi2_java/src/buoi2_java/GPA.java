/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi2_java;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author admin
 */
public class GPA {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double gpa = sc.nextDouble();
       if(gpa < 3.5)
           System.out.println("Hoc luc Kem");
       else if(3.5 <= gpa && gpa <5)
           System.out.println("Hoc luc Yeu");
       else if(5.0 <= gpa && gpa <7.0)
           System.out.println("Hoc luc Trung binh");
       else if(7.0 <= gpa && gpa <8.0)
           System.out.println("Hoc luc Kha");
       else if(8.0 <=gpa && gpa<9)
           System.out.println("Hoc luc Gioi");
       else if(9.0 <=gpa && gpa <=10)
           System.out.println("Hoc luc Xuat sac");
       Random rand = new Random();
       double gpa1 = rand.nextDouble(0, 10);
       System.out.println(gpa1);
    }
}
