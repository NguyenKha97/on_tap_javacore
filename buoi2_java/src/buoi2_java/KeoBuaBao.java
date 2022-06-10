/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi2_java;

import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author admin
 */
public class KeoBuaBao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println("Nguoi choi: " + s);
        s = s.toLowerCase();
        int nc = 0;
        if(s.endsWith("keo"))
            nc = 1;
        else if (s.equals("bua"))
            nc = 2;
        else if(s.equals("bao"))
            nc = 3;
        System.out.println(nc);
        Random rand = new Random();
        int ranNum = rand.nextInt(1, 3);
        if(ranNum == 1)
            System.out.println("May: Keo");
        else if(ranNum == 2)
            System.out.println("May: Bua");
        else if(ranNum == 3)
            System.out.println("May: Bao");
        
        if(nc == ranNum)
            System.out.println("=> Kqua: Hoa nhau");
        else {
            if(nc < ranNum && nc == (ranNum - 1))
                System.out.println("=> Kqua: May thang");
            else if(nc < ranNum && nc == (ranNum - 2))
                System.out.println("=> Kqua: Nguoi thang");
            else if(nc > ranNum && nc == (ranNum + 1))
                System.out.println("=> Kqua: Nguoi thang");
            else if(nc > ranNum && nc == (ranNum +2))
                System.out.println("=> Kqua: May thang");
        }     
    }
    
}
