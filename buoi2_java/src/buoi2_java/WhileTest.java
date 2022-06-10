/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi2_java;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class WhileTest {
    public static void main(String[] args) {
        int i = 0;
        while(i<100) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println(i);
        
        Scanner in = new Scanner(System.in);
        int j =0;
        do{
            System.out.print(j + " ");
            j++;
        }
        while(j <=100);
        System.out.print("\n");
        for(int a=0; a<=100; a++) {
            System.out.print(a + " ");
        }
        System.out.print("\n");
        for( ; ; ) {
            int b = in.nextInt();
            if(b >0){
                System.out.println(b);
                break;
            }
        }
        
//        int x;
//        do{
//            x = in.nextInt();
//        }
//        while(x <=0);
//        System.out.println("Gia tri x = " + x);
    }
}
