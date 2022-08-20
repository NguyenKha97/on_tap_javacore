
package btvn_buoi2_20522197;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class TroChoiKeoBuaBao {


    public static void main(String[] args) {

        System.out.println("CHAO MUNG BAN DEN VOI TRO CHOI KEO BUA BAO!!!");
        Scanner sc = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<String>();
        int flag = 1, h = 0, m = 0, e = 0;
        do {
            System.out.print("Hay nhap 1 trong cac lua chon (keo, bua, bao): ");
            String s = sc.next();
            System.out.println("Nguoi choi: " + s);
            s = s.toLowerCase();
            int nc = 0;
            if (s.equals("keo")) {
                nc = 3;
            } else if (s.equals("bua")) {
                nc = 6;
            } else if (s.equals("bao")) {
                nc = 9;
            }
//            System.out.println("nc = " + nc);
            Random rand = new Random();
            int ranNum = rand.nextInt(1, 9);
//            System.out.print("nhap ranNum: ");
//            int ranNum = sc.nextInt();
            if (ranNum >= 1 && ranNum <= 3) {
                System.out.println("May: Keo");
            } else if (ranNum >= 4 && ranNum <= 6) {
                System.out.println("May: Bua");
            } else if (ranNum >= 7 && ranNum <= 9) {
                System.out.println("May: Bao");
            }

            if (ranNum <= nc && (nc - ranNum) < 3) {
                System.out.println("=> Kqua: Hoa nhau");
                e++;
                a.add("Hoa nhau");
            } else {
                if (nc < ranNum && (ranNum - nc) <= 3) {
                    System.out.println("=> Kqua: May thang");
                    m++;
                    a.add("May thang");
                } else if (nc < ranNum && (ranNum - nc) > 3) {
                    System.out.println("=> Kqua: Nguoi thang");
                    h++;
                    a.add("Nguoi thang");
                } else if (nc > ranNum && (nc - ranNum) < 6) {
                    System.out.println("=> Kqua: Nguoi thang");
                    h++;
                    a.add("Nguoi thang");
                } else if (nc > ranNum && (nc - ranNum) >= 6) {
                    System.out.println("=> Kqua: May thang");
                    m++;
                    a.add("May thang");
                }
            }
            System.out.print("Chon 1 de choi tiep, chon 0 de thoat: ");
            int temp = sc.nextInt();
            if (temp == 0) {
                flag = 0;
            }
        } while (flag != 0);
        System.out.println("========================================");
        System.out.println("KET QUA TRO CHOI");
        System.out.print("Nguoi thang " + h + " tran, may thang " + m + " tran, hoa " + e + " tran.\n");
        System.out.println("Thong tin chi tiet:");
        int z = 1;
            for (String i : a) {
                System.out.println("Van " + z + ": " + i + ".");
                z++;
            }
        
    }
    
}
