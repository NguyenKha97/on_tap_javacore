/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vietlot;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class VietLot {

    public static void ktrTrung(String[] ve, String[] win, int sl) {
        int pairNum = 0;
//        String[] temp = win.clone();
        String[] temp = new String[6];
         System.arraycopy(win, 0, temp, 0, 6);
        for (String ve1 : ve) {
            for (int j = 0; j<win.length; j++) {
                if (ve1.contentEquals(win[j])) {
                    pairNum++;
                    temp[j]=temp[j].replace(win[j], "");
                }
            }
        }
        switch(pairNum){
            case 6 -> System.out.println(" trung 6 cap. JACKPOT!!! Ban trung giai I: 10.000.000.000 vnd/ve. So tien ban nhan duoc la: " + sl*10 +" ty vnd.");
            case 5 -> System.out.println(" trung 5 cap. Ban trung giai II: 10.000.000 vnd/ve. So tien ban nhan duoc la: " + sl*10 + " trieu vnd.");
            case 4 -> System.out.println(" trung 4 cap. Ban trung giai III: 300.000 vnd/ve. So tien ban nhan duoc la: " + sl*300000 + " vnd.");
            case 3 -> System.out.println(" trung 3 cap. Ban trung giai IV: 30.000 vnd/ve. So tien ban nhan duoc la: " + sl*30000 + " vnd.");
            case 2 -> System.out.println(" trung 2 cap. Khong co giai thuong.");
            case 1 -> System.out.println(" trung 1 cap. Khong co giai thuong");
            default -> System.out.println(" khong trung cap nao, chuc ban may man lan sau.");
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("VIETLOT !!! TRO THANH TY PHU NGAY HOM NAY !!!");
        Scanner sc = new Scanner(System.in);
        ArrayList<String[]> ve = new ArrayList<>();
        ArrayList<Integer> sl = new ArrayList<>();
        boolean flag = true;
        int choice;
        do{
        String[] num = new String[6];
        System.out.println("Nhap 6 con so may man cua ban trong khoang [1-45]:");
        for (int i=0; i<6; i++){
            System.out.print("Chon so thu "+(i+1)+": ");
            int temp = sc.nextInt();
            while(temp<1 || temp >45) {
                System.out.print("So ban vua nhap khong phu hop, moi nhap lai so khac trong khoang [1-45]: ");
                temp = sc.nextInt();
            }
            num[i] = String.format("%02d",temp);
        }
//        System.out.print("Chon A: ");
//        num[0] = String.format("%02d",sc.nextInt());
//        System.out.print("Chon B: ");
//        num[1] = String.format("%02d",sc.nextInt());
//        System.out.print("Chon C: ");
//        num[2] = String.format("%02d",sc.nextInt());
//        System.out.print("Chon D: ");
//        num[3] = String.format("%02d",sc.nextInt());
//        System.out.print("Chon E: ");
//        num[4] = String.format("%02d",sc.nextInt());
//        System.out.print("Chon F: ");
//        num[5] = String.format("%02d",sc.nextInt());
        ve.add(num);
        System.out.print("Nhap so luong ve muon mua: ");
        int temp1 = sc.nextInt();
        while(temp1<=0){
            System.out.print("So luong ve khong the <=0, moi nhap lai so luong ve muon mua: ");
            temp1 = sc.nextInt();
        } 
        sl.add(temp1);
        System.out.print("Nhap 1 de mua tiep, 0 de thanh toan: ");
        choice = sc.nextInt();
        if(choice == 0)
            flag = false;
        }
        while(flag);
        System.out.println("================================================");
        int sumSL = 0;
        for(int i : sl)
            sumSL+=i;
        System.out.println("Ban da mua " + sumSL + " ve, so tien phai tra la: " + sumSL*10000 + " VND.");
        System.out.println("Cac ve da mua va so luong:");
        for(int i=0; i<ve.size(); i++) {
            for(int j = 0; j<ve.get(i).length-1;j++)
                System.out.print(ve.get(i)[j] + " ");
            System.out.print(ve.get(i)[ve.get(i).length-1]);
            System.out.println("    sl: " + sl.get(i) + " ve.");
        }          
        System.out.println("================================================");
        Random ran = new Random();        
        String[] win = new String[6];
//        String[] winTest = {"11", "22", "33", "44", "01", "10"};
        int i=0; ArrayList<String> checkNum = new ArrayList<>();
        while(i<=5) {
            String temp = String.format("%02d", ran.nextInt(1, 45));
            while(checkNum.contains(temp)){
                temp = String.format("%02d", ran.nextInt(1, 45));
            }
            win[i] =  temp;
            checkNum.add(temp);
            i++;
        }     
        System.out.println("Con so trung thuong la: ");
        for(String j : win)
            System.out.print(j + " ");
        System.out.println("\n================================================\nThong tin trung thuong:");
        for(String[] x : ve){
            for(String y : x)
                System.out.print(y + " ");
            ktrTrung(x, win, sl.get(ve.indexOf(x)));
        }
    }
    
}
