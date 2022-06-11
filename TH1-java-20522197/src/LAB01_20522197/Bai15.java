/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB01_20522197;
import java.text.NumberFormat;
/**
 *
 * @author admin
 */
public class Bai15 {
    public static void main(String[] args) {
        System.out.print("(32)^0.2 - (1/64)^-25 + (8/27)^(1/3) = ");
        double result = (double)Math.round((Math.pow(32, 0.2) - (double)Math.pow(((double)1/64), -0.25) + (double)Math.pow(((double)8/27), ((double)1/3)))*100000)/100000;
        double result1 = (Math.pow(32, 0.2) - (double)Math.pow(((double)1/64), -0.25) + (double)Math.pow(((double)8/27), ((double)1/3)));
        System.out.println(result);
          
    }
}
