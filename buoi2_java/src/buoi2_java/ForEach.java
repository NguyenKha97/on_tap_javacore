/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi2_java;

/**
 *
 * @author admin
 */
public class ForEach {
    public static void main(String[] args) {
        String[] animals = {"dog", "cat", "fish", "mouse", "bird"};
        for(String i : animals){
            System.out.print(i + " ");
        }
        System.out.print("\n");
        for(int i=0; i< 10; i++) {
            if( i == 4)
                continue;
            if ( i == 7)
                break;
            System.out.print(i + " ");
        }
    }
}
