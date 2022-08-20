/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02_20522197;

/**
 *
 * @author admin
 */
public class Bai28_29_30 {
    public static void main(String[] args) {
        System.out.println("PT 2x + 7y + 9z = 979 co cac bo nghiem:");
        int min = 979, max =0 ;
        for(int i=1; i<=979/2; i++)
            for(int j=1; j<=(979-2*1); j++)
                for(int k=1; k<=(979-2*i-7*j); k++)
                    if(2*i + 7*j + 9*k == 979){
                        System.out.println("x = "+i + " y = " + j + " z = " + k);
                        max = (max <(i+j+k))? (i+j+k):max;
                        min = (min >(i+j+k))? (i+j+k):min;
                    }
        System.out.print("x + y + z max = " + max + " voi bo nghiem: ");
        for(int i=1; i<=979/2; i++)
            for(int j=1; j<=(979-2*1); j++)
                for(int k=1; k<=(979-2*i-7*j); k++)
                    if(2*i + 7*j + 9*k == 979 && (i+j+k)==max)
                        System.out.println("x = " +i + ", y = " + j + ", z = " + k);
        
        System.out.print("x + y + z min = " + min + " voi bo nghiem: ");
        for(int i=1; i<=979/2; i++)
            for(int j=1; j<=(979-2*1); j++)
                for(int k=1; k<=(979-2*i-7*j); k++)
                    if(2*i + 7*j + 9*k == 979 && (i+j+k)==min)
                        System.out.println("x = "+ +i + ", y = " + j + ", z = " + k);
        
    }
}
