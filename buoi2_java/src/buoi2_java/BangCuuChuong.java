/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi2_java;

/**
 *
 * @author admin
 */
public class BangCuuChuong {
    public static void main(String[] args) {
        int i = 2;
        while(i <= 9){
            System.out.println("Bang cuu chuong " + i);
            for(int j=1; j<11; j++) {
                System.out.println(j + " x " + i + " = " + i*j);
            }
            System.out.println("\n");
            i++;
        }
    }
}
